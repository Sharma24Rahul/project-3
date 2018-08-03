package com.joey.zoo.animals.zookeeper;

import com.joey.zoo.animals.animals.Cage;
import com.joey.zoo.animals.vaccination.MedicineStore;

public class Zoo {
    public static void main(String[] args) {
        MedicineStore medicineStore = new MedicineStore();
        Cage cage = new Cage();
        medicineStore.vaccination();
        cage.caged();

    }
}
