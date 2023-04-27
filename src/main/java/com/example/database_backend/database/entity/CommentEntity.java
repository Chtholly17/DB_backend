package com.example.database_backend.database.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "comment", schema = "urban")
public class CommentEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 50)
    private String id;
    @Basic
    @Column(name = "content", nullable = true, length = 200)
    private String content;
    @Basic
    @Column(name = "shop", nullable = false, length = 8)
    private String shop;
    @Basic
    @Column(name = "type", nullable = false, length = 7)
    private String type;
    @Basic
    @Column(name = "resident_id", nullable = true, length = 18)
    private String residentId;
    @ManyToOne
    @JoinColumn(name = "shop", referencedColumnName = "id", nullable = false)
    private ShopEntity shopByShop;
    @ManyToOne
    @JoinColumn(name = "resident_id", referencedColumnName = "id")
    private ResidentEntity residentByResidentId;

    public CommentEntity() {
    }

    public CommentEntity(String id, String content, String shop, String type, String residentId) {
        this.id = id;
        this.content = content;
        this.shop = shop;
        this.type = type;
        this.residentId = residentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        CommentEntity that = (CommentEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(content, that.content) && Objects.equals(shop, that.shop) && Objects.equals(type, that.type) && Objects.equals(residentId, that.residentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, shop, type, residentId);
    }

    public ShopEntity getShopByShop() {
        return shopByShop;
    }

    public void setShopByShop(ShopEntity shopByShop) {
        this.shopByShop = shopByShop;
    }

    public ResidentEntity getResidentByResidentId() {
        return residentByResidentId;
    }

    public void setResidentByResidentId(ResidentEntity residentByResidentId) {
        this.residentByResidentId = residentByResidentId;
    }
}
