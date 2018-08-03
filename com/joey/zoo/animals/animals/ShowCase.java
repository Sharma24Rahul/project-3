package com.joey.zoo.animals.animals;

import com.joey.zoo.animals.animals.Animal;

public class ShowCase extends Animal {

    private String name;
    private int age;
    private String healthstatus;
    public ShowCase(String name,int age,String healthstatus)
    {
        this.age=age;
        this.name=name;
        this.healthstatus=healthstatus;
    }

    public String getHealthStatus() {
        return healthstatus;
    }

    public void setHealthStatus(String healthstatus) {
        this.healthstatus = healthstatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
