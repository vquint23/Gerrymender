package com.example.Gerrymender.db_elements;


import com.example.Gerrymender.Abstractions.Area;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;


@Table(name="Edge")
@Entity
public class Edge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //Edge id; random double, we can probably increment; make it static, perhaps, such that no id is the same, a la autoincrement

    private double joinability;
    private Area neighborhood; //TODO: Define Area for our project


    public boolean updateJoinability(float join){
        assert(join>=0 && join <=1);
        joinability = join;
        return true;
    }

}