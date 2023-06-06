package com.example.database_backend.database.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "districtmanager", schema = "urban")
public class DistrictmanagerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 8)
    private String id;
    @Basic
    @Column(name = "district", nullable = false, length = 8)
    private String district;
    @Basic
    @Column(name = "resident_id", nullable = false, length = 18)
    private String residentId;
    @ManyToOne
    @JoinColumn(name = "district", referencedColumnName = "id", nullable = false)
    private DistrictEntity districtByDistrict;
    @ManyToOne
    @JoinColumn(name = "resident_id", referencedColumnName = "id", nullable = false)
    private ResidentEntity residentByResidentId;

    public DistrictmanagerEntity() {
    }

    public DistrictmanagerEntity(String id, String district, String residentId) {
        this.id = id;
        this.district = district;
        this.residentId = residentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getResidentId() {
        return residentId;
    }

    public void setResidentId(String residentId) {
        this.residentId = residentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DistrictmanagerEntity that = (DistrictmanagerEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(district, that.district) && Objects.equals(residentId, that.residentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, district, residentId);
    }

    public DistrictEntity getDistrictByDistrict() {
        return districtByDistrict;
    }

    public void setDistrictByDistrict(DistrictEntity districtByDistrict) {
        this.districtByDistrict = districtByDistrict;
    }

    public ResidentEntity getResidentByResidentId() {
        return residentByResidentId;
    }

    public void setResidentByResidentId(ResidentEntity residentByResidentId) {
        this.residentByResidentId = residentByResidentId;
    }
}
