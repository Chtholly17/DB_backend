package com.example.database_backend.database.entity;

/**
 * @author: chtholly
 * @date: 2022/4/24
 * @description: the entity class of resident, representing the table of resident in database
 *      columns: id(varchar), age(int), gender(Gender), name(varchar),residence(varchar),number(varchar)
 */

import lombok.Data;
import com.example.database_backend.util.Gender;

import javax.persistence.*;

@Data
@Entity
@Table(name = "resident",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class resident{
    @Id
    @Column(name = "id", nullable = false, length = 20)
    private String id;

    @Column(name = "age", nullable = false, length = 20)
    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @MapsId
    @JoinColumn(name = "id")
    @ManyToOne(targetEntity = residence.class)
    private String residence;

    public resident() {
    }

    // a constructor for resident with parameters
    public resident(String id,int age,Gender gender,String name,String residence){
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.residence = residence;
    }

}