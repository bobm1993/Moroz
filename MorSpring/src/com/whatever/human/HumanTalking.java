package com.whatever.human;

import com.whatever.pet.Pet;

import java.util.ArrayList;

/**
 * Created by bob on 08.10.2015.
 */
public class HumanTalking implements Human {
    public HumanTalking(){}
    public HumanTalking(String s){
        System.out.println(s);
    }
    private String s;
    private Pet pet;
    private String namePet;
    private ArrayList<String> hobbies;

    public void tell(){
        System.out.println("My name is "+s);
        pet.type();
        pet.name(namePet);

    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }
}
