package com.example.database_backend.database.entity;

/**
 * @author: chtholly
 * @date: 2022/4/24
 * @description: the entity class of building, representing the table of building in database
 *      columns: id(varchar), number(int), unit(int), community(varchar)
 */

import lombok.Data;

import com.example.database_backend.database.entity.community;

import javax.persistence.*;

@Data
@Entity
@Table(name = "building",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class building {
    @Id
    @Column(name = "id", nullable = false, length = 20)
    private String id;

    @Column(name = "number", nullable = false, length = 20)
    private int number;

    @Column(name = "unit", nullable = false, length = 20)
    private int unit;

    @MapsId
    @ManyToOne(targetEntity = community.class)
    @JoinColumn(name = "id")
    private String community;
}
