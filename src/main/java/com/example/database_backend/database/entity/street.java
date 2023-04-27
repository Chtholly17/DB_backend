package com.example.database_backend.database.entity;


/**
 * @author: chtholly
 * @date: 2022/4/24
 * @description: the entity class of street, representing the table of street in database
 *      columns: id(varchar), name(varchar), district(varchar)
 */

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "street", uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class street {
    @Id
    @Column(name = "id", nullable = false, length = 20)
    private String id;
    @Column(name = "name", nullable = false, length = 20)
    private String name;
    @MapsId
    @ManyToOne(targetEntity = district.class)
    @JoinColumn(name = "id")
    private String district;

    public street() {
    }

    public street(String id, String name, String district) {
        this.id = id;
        this.name = name;
        this.district = district;
    }
}
