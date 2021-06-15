package com.aquariumhabitat.demo.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Environments {

    @Id
    @GeneratedValue
    private long id;
    private String environmentName;
    @Lob
    private String environmentDescription;
    @ManyToOne
    private Water waterType;
    @ManyToMany (mappedBy ="environment")
    private Collection<Fish> fish;
    private int careReqLvl;
    private String environmentImg;
    public long getId() {
        return id;
    }
    public String getEnvironmentName() {
        return environmentName;
    }
    public Collection<Fish> getFish() {
        return  fish;
    }
    public String getEnvironmentDescription() {
        return environmentDescription;
    }
    public Water getWaterType() {
        return waterType;
    }
    public int getCareReqLvl() {
        return careReqLvl;
    }
    public String getEnvironmentImg() {
        return environmentImg;
    }

    public Environments(){
    }

    public Environments(String environmentName, String environmentDescription,
                        Water waterType, int careReqLvl,String environmentImg,  Fish...fish ) {
        this.environmentName = environmentName;
        this.environmentDescription = environmentDescription;
        this.waterType = waterType;
        this.careReqLvl = careReqLvl;
        this.fish=new ArrayList<>(Arrays.asList(fish));
        this.environmentImg = environmentImg;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Environments that = (Environments) o;
        return id == that.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}