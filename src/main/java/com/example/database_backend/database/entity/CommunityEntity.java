package com.example.database_backend.database.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "community", schema = "urban")
public class CommunityEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 8)
    private String id;
    @Basic
    @Column(name = "name", nullable = false, length = 20)
    private String name;
    @Basic
    @Column(name = "area", nullable = false)
    private int area;
    @Basic
    @Column(name = "street", nullable = false, length = 8)
    private String street;
    @OneToMany(mappedBy = "communityByCommunity")
    private Collection<BuildingEntity> buildingsById;
    @ManyToOne
    @JoinColumn(name = "street", referencedColumnName = "id", nullable = false)
    private StreetEntity streetByStreet;
    @OneToMany(mappedBy = "communityByCommunity")
    private Collection<CommunitymanagerEntity> communitymanagersById;


    public CommunityEntity() {
    }

    public CommunityEntity(String id, String name, int area, String street) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.street = street;
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

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommunityEntity that = (CommunityEntity) o;
        return area == that.area && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(street, that.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, area, street);
    }

    public Collection<BuildingEntity> getBuildingsById() {
        return buildingsById;
    }

    public void setBuildingsById(Collection<BuildingEntity> buildingsById) {
        this.buildingsById = buildingsById;
    }

    public StreetEntity getStreetByStreet() {
        return streetByStreet;
    }

    public void setStreetByStreet(StreetEntity streetByStreet) {
        this.streetByStreet = streetByStreet;
    }

    public Collection<CommunitymanagerEntity> getCommunitymanagersById() {
        return communitymanagersById;
    }

    public void setCommunitymanagersById(Collection<CommunitymanagerEntity> communitymanagersById) {
        this.communitymanagersById = communitymanagersById;
    }
}
