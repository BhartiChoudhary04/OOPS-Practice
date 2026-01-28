package org.example.MultipleInheritace;

public class Vehicle implements Car, Bike {
    public void start(){
        System.out.println("Bike");
    }
}
