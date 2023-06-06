package com.example.database_backend.database.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "resident", schema = "urban")
public class ResidentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 18)
    private String id;
    @Basic
    @Column(name = "age", nullable = false)
    private int age;
    @Basic
    @Column(name = "gender", nullable = false, length = 6)
    private String gender;
    @Basic
    @Column(name = "name", nullable = false, length = 10)
    private String name;
    @Basic
    @Column(name = "residence", nullable = false, length = 8)
    private String residence;
    @Basic
    @Column(name = "number", nullable = false, length = 11)
    private String number;
    @OneToMany(mappedBy = "residentByResidentId")
    private Collection<CommentEntity> commentsById;
    @OneToMany(mappedBy = "residentByResidentId")
    private Collection<CommunitymanagerEntity> communitymanagersById;
    @OneToMany(mappedBy = "residentByResidentId")
    private Collection<DistrictmanagerEntity> districtmanagersById;
    @ManyToOne
    @JoinColumn(name = "residence", referencedColumnName = "id", nullable = false)
    private ResidenceEntity residenceByResidence;
    @OneToMany(mappedBy = "residentByRespondent")
    private Collection<VisitEntity> visitsById;
    @OneToMany(mappedBy = "residentByVisitor")
    private Collection<VisitEntity> visitsById_0;
    @Basic
    @Column(name = "passwd", nullable = false, length = 50)
    private String passwd;

    public ResidentEntity() {
    }


    // constructor with parameters

    public ResidentEntity(String id, int age, String gender, String name, String residence, String number, Collection<CommentEntity> commentsById, Collection<CommunitymanagerEntity> communitymanagersById, Collection<DistrictmanagerEntity> districtmanagersById, ResidenceEntity residenceByResidence, Collection<VisitEntity> visitsById, Collection<VisitEntity> visitsById_0) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.residence = residence;
        this.number = number;
        this.commentsById = commentsById;
        this.communitymanagersById = communitymanagersById;
        this.districtmanagersById = districtmanagersById;
        this.residenceByResidence = residenceByResidence;
        this.visitsById = visitsById;
        this.visitsById_0 = visitsById_0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
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
        ResidentEntity that = (ResidentEntity) o;
        return age == that.age && Objects.equals(id, that.id) && Objects.equals(gender, that.gender) && Objects.equals(name, that.name) && Objects.equals(residence, that.residence) && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, gender, name, residence, number);
    }

    public Collection<CommentEntity> getCommentsById() {
        return commentsById;
    }

    public void setCommentsById(Collection<CommentEntity> commentsById) {
        this.commentsById = commentsById;
    }

    public Collection<CommunitymanagerEntity> getCommunitymanagersById() {
        return communitymanagersById;
    }

    public void setCommunitymanagersById(Collection<CommunitymanagerEntity> communitymanagersById) {
        this.communitymanagersById = communitymanagersById;
    }

    public Collection<DistrictmanagerEntity> getDistrictmanagersById() {
        return districtmanagersById;
    }

    public void setDistrictmanagersById(Collection<DistrictmanagerEntity> districtmanagersById) {
        this.districtmanagersById = districtmanagersById;
    }

    public ResidenceEntity getResidenceByResidence() {
        return residenceByResidence;
    }

    public void setResidenceByResidence(ResidenceEntity residenceByResidence) {
        this.residenceByResidence = residenceByResidence;
    }

    public Collection<VisitEntity> getVisitsById() {
        return visitsById;
    }

    public void setVisitsById(Collection<VisitEntity> visitsById) {
        this.visitsById = visitsById;
    }

    public Collection<VisitEntity> getVisitsById_0() {
        return visitsById_0;
    }

    public void setVisitsById_0(Collection<VisitEntity> visitsById_0) {
        this.visitsById_0 = visitsById_0;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
