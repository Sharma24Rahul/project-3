package com.joey.zoo.animals.animals;

import com.joey.zoo.animals.animals.Animal;

public class Mammels extends Animal {
    private String name;
    private int age;
    private String healthStatus;
    public Mammels(String name,int age,String healthStatus)
    {
        this.age=age;
        this.name=name;
        this.healthStatus=healthStatus;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
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
