package org.homework.entity;

public class Worker extends Employee{
    private static int idInc = 1;
    public Worker(String name, String phoneNumber, int yearsOfExperience) {
        super(idInc, name, phoneNumber, yearsOfExperience);
        ++idInc;
    }

}
