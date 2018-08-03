package com.joey.zoo.animals.vaccination;

public class Vaccine extends MedicalProduct {
    private String nameOfVaccine;
    private String dateOfManufacture;
    private String dateOfExpire;
    public Vaccine(String nameOfVaccine,String dateOfManufacture,String dateOfExpire)
    {
        this.dateOfExpire=dateOfExpire;
        this.dateOfManufacture=dateOfManufacture;
        this.nameOfVaccine=nameOfVaccine;
    }

    @Override
    public String getDateOfExpire() {
        return dateOfExpire;
    }

    @Override
    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    @Override
    public String getNameOfVaccine() {
        return nameOfVaccine;
    }

    public void setDateOfExpire(String dateOfExpire) {
        this.dateOfExpire = dateOfExpire;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public void setNameOfVaccine(String nameOfVaccine) {
        this.nameOfVaccine = nameOfVaccine;
    }
}
