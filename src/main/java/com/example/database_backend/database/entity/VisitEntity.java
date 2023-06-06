package com.example.database_backend.database.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "visit", schema = "urban")
public class VisitEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 8)
    private String id;
    @Basic
    @Column(name = "respondent", nullable = false, length = 18)
    private String respondent;
    @Basic
    @Column(name = "visitor", nullable = false, length = 18)
    private String visitor;
    @Basic
    @Column(name = "state", nullable = false, length = 8)
    private String state;
    @Basic
    @Column(name = "processor", nullable = false, length = 8)
    private String processor;
    @ManyToOne
    @JoinColumn(name = "respondent", referencedColumnName = "id", nullable = false)
    private ResidentEntity residentByRespondent;
    @ManyToOne
    @JoinColumn(name = "visitor", referencedColumnName = "id", nullable = false)
    private ResidentEntity residentByVisitor;
    @ManyToOne
    @JoinColumn(name = "processor", referencedColumnName = "id", nullable = false)
    private CommunitymanagerEntity communitymanagerByProcessor;

    public VisitEntity() {
    }

    public VisitEntity(String id, String respondent, String visitor, String state, String processor) {
        this.id = id;
        this.respondent = respondent;
        this.visitor = visitor;
        this.state = state;
        this.processor = processor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRespondent() {
        return respondent;
    }

    public void setRespondent(String respondent) {
        this.respondent = respondent;
    }

    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor) {
        this.visitor = visitor;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VisitEntity that = (VisitEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(respondent, that.respondent) && Objects.equals(visitor, that.visitor) && Objects.equals(state, that.state) && Objects.equals(processor, that.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, respondent, visitor, state, processor);
    }

    public ResidentEntity getResidentByRespondent() {
        return residentByRespondent;
    }

    public void setResidentByRespondent(ResidentEntity residentByRespondent) {
        this.residentByRespondent = residentByRespondent;
    }

    public ResidentEntity getResidentByVisitor() {
        return residentByVisitor;
    }

    public void setResidentByVisitor(ResidentEntity residentByVisitor) {
        this.residentByVisitor = residentByVisitor;
    }

    public CommunitymanagerEntity getCommunitymanagerByProcessor() {
        return communitymanagerByProcessor;
    }

    public void setCommunitymanagerByProcessor(CommunitymanagerEntity communitymanagerByProcessor) {
        this.communitymanagerByProcessor = communitymanagerByProcessor;
    }
}
