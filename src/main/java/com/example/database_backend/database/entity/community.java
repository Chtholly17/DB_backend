package com.example.database_backend.database.entity;


/**
 * @author: chtholly
 * @date: 2022/4/24
 * @description: the entity class of community, representing the table of community in database
 *      columns: id(varchar), name(varchar), area(int), street(varchar)
 */

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "community",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class community {
    @Id
    @Column(name = "id", nullable = false, length = 20)
    private String id;
    @Column(name = "name", nullable = false, length = 20)
    private String name;
    @Column(name = "area", nullable = false, length = 20)
    private int area;
    @MapsId
    @ManyToOne(targetEntity = street.class)
    @JoinColumn(name = "id")
    private String street;

    public community() {
    }

    public community(String id, String name, int area, String street) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.street = street;
    }

}
