package com.example.database_backend.database.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "communitymanager", schema = "urban")
public class CommunitymanagerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 8)
    private String id;
    @Basic
    @Column(name = "community", nullable = false, length = 8)
    private String community;
    @Basic
    @Column(name = "resident_id", nullable = false, length = 18)
    private String residentId;
    @ManyToOne
    @JoinColumn(name = "community", referencedColumnName = "id", nullable = false)
    private CommunityEntity communityByCommunity;
    @ManyToOne
    @JoinColumn(name = "resident_id", referencedColumnName = "id", nullable = false)
    private ResidentEntity residentByResidentId;
    @OneToMany(mappedBy = "communitymanagerByProcessor")
    private Collection<VisitEntity> visitsById;

    public CommunitymanagerEntity() {
    }

    public CommunitymanagerEntity(String id, String community, String residentId) {
        this.id = id;
        this.community = community;
        this.residentId = residentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
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
        CommunitymanagerEntity that = (CommunitymanagerEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(community, that.community) && Objects.equals(residentId, that.residentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, community, residentId);
    }

    public CommunityEntity getCommunityByCommunity() {
        return communityByCommunity;
    }

    public void setCommunityByCommunity(CommunityEntity communityByCommunity) {
        this.communityByCommunity = communityByCommunity;
    }

    public ResidentEntity getResidentByResidentId() {
        return residentByResidentId;
    }

    public void setResidentByResidentId(ResidentEntity residentByResidentId) {
        this.residentByResidentId = residentByResidentId;
    }

    public Collection<VisitEntity> getVisitsById() {
        return visitsById;
    }

    public void setVisitsById(Collection<VisitEntity> visitsById) {
        this.visitsById = visitsById;
    }
}
