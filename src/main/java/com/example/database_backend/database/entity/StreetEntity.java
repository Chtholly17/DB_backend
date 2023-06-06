package com.example.database_backend.database.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "street", schema = "urban")
public class StreetEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 8)
    private String id;
    @Basic
    @Column(name = "name", nullable = false, length = 20)
    private String name;
    @Basic
    @Column(name = "district", nullable = false, length = 8)
    private String district;
    @OneToMany(mappedBy = "streetByStreet")
    private Collection<CommunityEntity> communitiesById;
    @OneToMany(mappedBy = "streetByStreet")
    private Collection<PublicEntity> publicsById;
    @OneToMany(mappedBy = "streetByStreet")
    private Collection<ShopEntity> shopsById;
    @ManyToOne
    @JoinColumn(name = "district", referencedColumnName = "id", nullable = false)
    private DistrictEntity districtByDistrict;

    public StreetEntity() {
    }

    public StreetEntity(String id, String name, String district) {
        this.id = id;
        this.name = name;
        this.district = district;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StreetEntity that = (StreetEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(district, that.district);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, district);
    }

    public Collection<CommunityEntity> getCommunitiesById() {
        return communitiesById;
    }

    public void setCommunitiesById(Collection<CommunityEntity> communitiesById) {
        this.communitiesById = communitiesById;
    }

    public Collection<PublicEntity> getPublicsById() {
        return publicsById;
    }

    public void setPublicsById(Collection<PublicEntity> publicsById) {
        this.publicsById = publicsById;
    }

    public Collection<ShopEntity> getShopsById() {
        return shopsById;
    }

    public void setShopsById(Collection<ShopEntity> shopsById) {
        this.shopsById = shopsById;
    }

    public DistrictEntity getDistrictByDistrict() {
        return districtByDistrict;
    }

    public void setDistrictByDistrict(DistrictEntity districtByDistrict) {
        this.districtByDistrict = districtByDistrict;
    }
}
