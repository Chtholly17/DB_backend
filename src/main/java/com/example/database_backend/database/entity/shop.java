package com.example.database_backend.database.entity;

/**
 * @author: chtholly
 * @date: 2022/4/24
 * @description: the entity class of community, representing the table of community in database
 *      columns: id(varchar), name(varchar), type(ShopType), number(varchar), street(varchar), introduction(varchar)
 */

import javax.persistence.*;
import lombok.Data;

import com.example.database_backend.util.ShopType;


@Entity
@Data
@Table(name = "shop",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class shop {
    @Id
    @Column(name = "id", nullable = false, length = 20)
    private String id;
    @Column(name = "name", nullable = true, length = 20)
    private String name;
    @Enumerated(EnumType.STRING)
    private ShopType type;
    @Column(name = "number", nullable = true, length = 20)
    private String number;
    @MapsId
    @ManyToOne(targetEntity = street.class)
    @JoinColumn(name = "id")
    private String street;
    @Column(name = "introduction", nullable = true, length = 80)
    private String introduction;

    public shop() {
    }

    public shop(String id, String name, ShopType type, String number, String street, String introduction) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.number = number;
        this.street = street;
        this.introduction = introduction;
    }
}
