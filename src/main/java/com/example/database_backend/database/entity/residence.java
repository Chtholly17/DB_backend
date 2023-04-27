package com.example.database_backend.database.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author: chtholly
 * @date: 2022/4/24
 * @description: the entity class of residence, representing the table of residence in database
 *      columns: id(varchar) , waterFee(int), electricityFee(int), building(varchar), floor(int), number(int)
 */

@Data
@Entity
@Table(name = "residence",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class residence {
    @Id
    @Column(name = "id", nullable = false, length = 20)
    private String id;

    @Column(name = "waterFee", nullable = false, length = 20)
    private int waterFee;
    @Column(name = "electricityFee", nullable = false, length = 20)
    private int electricityFee;

    @MapsId
    @JoinColumn(name = "id")
    @ManyToOne(targetEntity = building.class)
    private building building;

    @Column(name = "floor", nullable = false, length = 20)
    private int floor;
    @Column(name = "number", nullable = true, length = 20)
    private int number;

    public residence() {
    }

    public residence(String id, int waterFee, int electricityFee, building building, int floor, int number) {
        this.id = id;
        this.waterFee = waterFee;
        this.electricityFee = electricityFee;
        this.building = building;
        this.floor = floor;
        this.number = number;
    }
}
