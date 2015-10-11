package com.whatever.human;

import com.whatever.hobbies.Hobbies;
import com.whatever.pet.Pet;

import java.util.ArrayList;

/**
 * Created by bob on 08.10.2015.
 */
public class HumanNoTalking implements Human {
    private String name;
    private Pet pet;
    private String petName;
    private ArrayList<Hobbies> hobbies;

    public void tell(){
        System.out.println("Show on the list "+ getName());
        getPet().type();
        getPet().name(getPetName());
        System.out.println("There are my hobbies:");
        for(Hobbies hobby : getHobbies()){
            hobby.hob();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }


    public ArrayList<Hobbies> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<Hobbies> hobbies) {
        this.hobbies = hobbies;
    }
}
