package com.aquariumhabitat.demo.models;


import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Fish {



    @Id
    @GeneratedValue
    private long id;
    private String fishName;
    @Lob
    private String fishDescription;
    @ManyToOne
    private Water waterType;
    @ManyToMany
    private Collection<Environments> environment;
    private String careDescription;
    private int careReqLvl;
    private String fishImg;
    public long getId() {
        return id;
    }

    public String getFishName() {
        return fishName;
    }

    public String getFishDescription() {
        return fishDescription;
    }

    public Water getWaterType() {
        return waterType;
    }

    public Collection<Environments> getEnvironment() {
        return  environment;
    }

    public String getCareDescription() {
        return careDescription;
    }

    public int getCareReqLvl() {
        return careReqLvl;
    }

    public String getFishImg() {
        return fishImg;
    }

    public Fish(){

    }


    public Fish(String fishName, String fishDescription, Water waterType,
                 String careDescription, int careReqLvl, String fishImg){

        this.fishName=fishName;
        this.fishDescription=fishDescription;
        this.waterType=waterType;
//        this.environment=environment;
        this.careDescription=careDescription;
        this.careReqLvl=careReqLvl;
        this.fishImg=fishImg;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fish fish = (Fish) o;
        return id == fish.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
