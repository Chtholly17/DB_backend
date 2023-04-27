package com.example.database_backend.database.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "shop", schema = "urban")
public class ShopEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 8)
    private String id;
    @Basic
    @Column(name = "name", nullable = true, length = 20)
    private String name;
    @Basic
    @Column(name = "type", nullable = false, length = 10)
    private String type;
    @Basic
    @Column(name = "number", nullable = true, length = 8)
    private String number;
    @Basic
    @Column(name = "street", nullable = false, length = 8)
    private String street;
    @Basic
    @Column(name = "introduction", nullable = true, length = 80)
    private String introduction;
    @OneToMany(mappedBy = "shopByShop")
    private Collection<CommentEntity> commentsById;
    @ManyToOne
    @JoinColumn(name = "street", referencedColumnName = "id", nullable = false)
    private StreetEntity streetByStreet;

    public ShopEntity() {
    }

    public ShopEntity(String id, String name, String type, String number, String street, String introduction) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.number = number;
        this.street = street;
        this.introduction = introduction;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopEntity that = (ShopEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(type, that.type) && Objects.equals(number, that.number) && Objects.equals(street, that.street) && Objects.equals(introduction, that.introduction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, number, street, introduction);
    }

    public Collection<CommentEntity> getCommentsById() {
        return commentsById;
    }

    public void setCommentsById(Collection<CommentEntity> commentsById) {
        this.commentsById = commentsById;
    }

    public StreetEntity getStreetByStreet() {
        return streetByStreet;
    }

    public void setStreetByStreet(StreetEntity streetByStreet) {
        this.streetByStreet = streetByStreet;
    }
}
