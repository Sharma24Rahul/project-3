package com.joey.zoo.animals.animals;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    public void caged()
    {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new WaterAnimal("Guppy",4,"fit"));
        animalList.add(new WaterAnimal("Catfish",3,"fit"));
        animalList.add(new WaterAnimal("Goldfish",5,"fit"));
        animalList.add(new Bird("Parrot",2,"fit"));
        animalList.add(new Bird("Albatros",5,"fit"));
        animalList.add(new Bird("Owl",1,"fit"));
        animalList.add(new Mammels("Tiger",3,"fit"));
        animalList.add(new Mammels("Bear",10,"fit"));
        animalList.add(new Mammels("Lion",20,"fit"));
        animalList.add(new ShowCase("mammel",2,"fit"));
        System.out.println("animals in zoo:");
        System.out.println();
        for(int k=0;k<animalList.size();k++)
        {
            System.out.println(animalList.get(k).getName()+"-"+animalList.get(k).getAge()+" years old"+
                    " and animal is: "+animalList.get(k).getHealthStatus());
        }


    }
}
