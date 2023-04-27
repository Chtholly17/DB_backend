package com.example.database_backend.database.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "building", schema = "urban")
public class BuildingEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 8)
    private String id;
    @Basic
    @Column(name = "number", nullable = false)
    private int number;
    @Basic
    @Column(name = "unit", nullable = false)
    private int unit;
    @Basic
    @Column(name = "community", nullable = false, length = 8)
    private String community;
    @ManyToOne
    @JoinColumn(name = "community", referencedColumnName = "id", nullable = false)
    private CommunityEntity communityByCommunity;
    @OneToMany(mappedBy = "buildingByBuilding")
    private Collection<ResidenceEntity> residencesById;

    public BuildingEntity() {
    }

    public BuildingEntity(String id, int number, int unit, String community) {
        this.id = id;
        this.number = number;
        this.unit = unit;
        this.community = community;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuildingEntity that = (BuildingEntity) o;
        return number == that.number && unit == that.unit && Objects.equals(id, that.id) && Objects.equals(community, that.community);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, unit, community);
    }

    public CommunityEntity getCommunityByCommunity() {
        return communityByCommunity;
    }

    public void setCommunityByCommunity(CommunityEntity communityByCommunity) {
        this.communityByCommunity = communityByCommunity;
    }

    public Collection<ResidenceEntity> getResidencesById() {
        return residencesById;
    }

    public void setResidencesById(Collection<ResidenceEntity> residencesById) {
        this.residencesById = residencesById;
    }
}
