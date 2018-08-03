package com.joey.zoo.animals.vaccination;

import java.util.ArrayList;
import java.util.List;

public class MedicineStore {
    public void vaccination()
    {
        List<MedicalProduct> vaccineList = new ArrayList<>();
        vaccineList.add(new Vaccine("Enteric-Redmouth",
                "20/8/17","20/8/20"));
        vaccineList.add(new Vaccine("Canine-parainfluenza","20/7/16"
        ,"20/8/20"));
        vaccineList.add(new Vaccine(" avian-polyomavirus",
                "20/5/18","" + "20,6,21"));
        System.out.println("vaccine date of manufacture date of expiry");
        System.out.println();
        for(int i=0;i<vaccineList.size();i++)
        {
            System.out.println("vaccine = "+vaccineList.get(i).getNameOfVaccine()+" from "
                    +vaccineList.get(i).getDateOfManufacture()+" to"
            +" "+vaccineList.get(i).getDateOfExpire());
        }
        System.out.println();




    }
}
