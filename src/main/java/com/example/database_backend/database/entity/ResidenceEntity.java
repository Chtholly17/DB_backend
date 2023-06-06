package com.example.database_backend.database.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "residence", schema = "urban")
public class ResidenceEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 8)
    private String id;
    @Basic
    @Column(name = "waterFee", nullable = false)
    private int waterFee;
    @Basic
    @Column(name = "electricityFee", nullable = false)
    private int electricityFee;
    @Basic
    @Column(name = "building", nullable = false, length = 8)
    private String building;
    @Basic
    @Column(name = "floor", nullable = false)
    private int floor;
    @Basic
    @Column(name = "number", nullable = true, length = 4)
    private String number;
    @ManyToOne
    @JoinColumn(name = "building", referencedColumnName = "id", nullable = false)
    private BuildingEntity buildingByBuilding;
    @OneToMany(mappedBy = "residenceByResidence")
    private Collection<ResidentEntity> residentsById;


    public ResidenceEntity() {
    }

    public ResidenceEntity(String id, int waterFee, int electricityFee, String building, int floor, String number) {
        this.id = id;
        this.waterFee = waterFee;
        this.electricityFee = electricityFee;
        this.building = building;
        this.floor = floor;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWaterFee() {
        return waterFee;
    }

    public void setWaterFee(int waterFee) {
        this.waterFee = waterFee;
    }

    public int getElectricityFee() {
        return electricityFee;
    }

    public void setElectricityFee(int electricityFee) {
        this.electricityFee = electricityFee;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResidenceEntity that = (ResidenceEntity) o;
        return waterFee == that.waterFee && electricityFee == that.electricityFee && floor == that.floor && Objects.equals(id, that.id) && Objects.equals(building, that.building) && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, waterFee, electricityFee, building, floor, number);
    }

    public BuildingEntity getBuildingByBuilding() {
        return buildingByBuilding;
    }

    public void setBuildingByBuilding(BuildingEntity buildingByBuilding) {
        this.buildingByBuilding = buildingByBuilding;
    }

    public Collection<ResidentEntity> getResidentsById() {
        return residentsById;
    }

    public void setResidentsById(Collection<ResidentEntity> residentsById) {
        this.residentsById = residentsById;
    }
}
