package com.example.Gerrymender.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Table(name = "Precinct")
@Entity
public class Precinct implements Serializable {
    private static final long SerializeID = 2L; //or some other ID
    @Id //ID Annotation for the subclasses
    @Column
    private String precinctid; //replaces name and ID in state, precinct, district
    @Column
    private String statename; //Can't have a state object, as that would bring in circular dependencies.
    @Column
    private long totalpop;
    @Column
    private String party;
    @Column
    private String countyname;
    @Column
    private long whitepop;
    @Column
    private long africanamericanpop;
    @Column
    private long hispanicpop;
    @Column
    private long asianpop;
    @Column
    private long nativeamericanpop;
    @Column
    private String neighbors;
    @Column
    @Lob
    private String points;

    public String getPoints() {return points;}

    public void setPoints(String points) {this.points = points;}

    public long getNativeAmerican_pop() {
        return nativeamericanpop;
    }

    public void setNativeAmerican_pop(long nativeamericanpop) {
        this.nativeamericanpop = nativeamericanpop;
    }

    public long getAsian_pop() {
        return asianpop;
    }

    public void setAsian_pop(long asianpop) {
        this.asianpop = asianpop;
    }

    public long getHispanic_pop() {
        return hispanicpop;
    }

    public void setHispanic_pop(long hispanicpop) {
        this.hispanicpop = hispanicpop;
    }

    public long getAfricanAmerican_pop() {
        return africanamericanpop;
    }

    public void setAfricanAmerican_pop(long africanamericanpop) {
        this.africanamericanpop = africanamericanpop;
    }

    public long getWhite_pop() {
        return whitepop;
    }

    public void setWhite_pop(long white_pop) {
        this.whitepop = white_pop;
    }

    public String getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(String neighbors) {
        this.neighbors = neighbors;
    }

    public String getNameID() {
        return precinctid;
    }

    public void setNameID(String nameID) {
        assertNotEquals(nameID, "");
        this.precinctid = nameID;
    }

    public long getTotalPop() {
        return totalpop;
    }

    public void setTotalPop(long totalPop) {
        if (totalPop <= 0)
            this.totalpop = 0;
        else
            this.totalpop = totalPop;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }


    public String getStateName() {
        return statename;
    }

    public void setStateName(String districtID) {
        this.statename = districtID;
    }

    public String getCountyName() {
        return countyname;
    }

    public void setCountyName(String countyName) {
        this.countyname = countyName;
    }
}
