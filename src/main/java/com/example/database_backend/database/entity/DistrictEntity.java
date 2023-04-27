package com.example.database_backend.database.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "district", schema = "urban")
public class DistrictEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 8)
    private String id;
    @Basic
    @Column(name = "name", nullable = false, length = 20)
    private String name;
    @OneToMany(mappedBy = "districtByDistrict")
    private Collection<DistrictmanagerEntity> districtmanagersById;
    @OneToMany(mappedBy = "districtByDistrict")
    private Collection<StreetEntity> streetsById;

    public DistrictEntity() {
    }

    public DistrictEntity(String id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DistrictEntity that = (DistrictEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Collection<DistrictmanagerEntity> getDistrictmanagersById() {
        return districtmanagersById;
    }

    public void setDistrictmanagersById(Collection<DistrictmanagerEntity> districtmanagersById) {
        this.districtmanagersById = districtmanagersById;
    }

    public Collection<StreetEntity> getStreetsById() {
        return streetsById;
    }

    public void setStreetsById(Collection<StreetEntity> streetsById) {
        this.streetsById = streetsById;
    }
}
