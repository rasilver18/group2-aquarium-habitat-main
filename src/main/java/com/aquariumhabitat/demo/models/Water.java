package com.aquariumhabitat.demo.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;
@Entity
public class Water {



        @Id
        @GeneratedValue
        private Long id;
        private String waterName;
        @Lob
        private String description;
        private int careLevel;
        private String image;
        @OneToMany(mappedBy = "templates/water")
        private Collection<Fish> allFish;

        @OneToMany(mappedBy = "templates/water")
        private Collection<Environments> environments;

        public Long getId() {
            return id;
        }

        public String getWaterName() {
            return waterName;
        }

    public String getDescription() {
        return description;
    }

    public int getCareLevel() {
        return careLevel;
    }

    public String getImage() {
        return image;
    }
    public  Collection<Fish> getAllFish(){
            return allFish;
    }

    public Collection<Environments> getEnvironments() {
            return environments;
        }

        public Water(){

        }

        public Water(String waterName, String description, int careLevel, String image) {
            this.waterName = waterName;
            this.description= description;
            this.careLevel=careLevel;
            this.image=image;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Water water = (Water) o;
            return Objects.equals(id, water.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }

