package org.homework.entity;

public class Worker extends Employee{
    private static int idInc = 1;
    public Worker(String phoneNumber, String name, byte yearsOfExperience) {
        super(idInc, phoneNumber, name, yearsOfExperience);
        ++idInc;
    }

}
