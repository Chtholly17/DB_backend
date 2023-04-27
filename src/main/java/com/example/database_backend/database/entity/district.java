package com.example.database_backend.database.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author: chtholly
 * @date: 2022/4/24
 * @description: the entity class of district, representing the table of district in database
 *      columns: id(varchar), name(varchar)
 */
import javax.persistence.*;
@Data
@Entity
@Table(name = "district",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class district {
    @Id
    @Column(name = "id", nullable = false, length = 20)
    private String id;
    @Column(name = "name", nullable = false, length = 20)
    private String name;

    public district() {
    }

    public district(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
