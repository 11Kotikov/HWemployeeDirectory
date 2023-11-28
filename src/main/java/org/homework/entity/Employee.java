package org.homework.entity;

import java.util.Objects;

public abstract class Employee {
    private int id;
    private String phoneNumber;
    private String name;
    private byte yearsOfExperience;

    public Employee(int id, String phoneNumber, String name, byte yearsOfExperience) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(byte yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "id: " + id + " phoneNumber: " + phoneNumber +
                " name: " + name + " yearsOfExperience: " + yearsOfExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                phoneNumber.equals(employee.phoneNumber) &&
                name.equals(employee.name) &&
                (byte) employee.yearsOfExperience == yearsOfExperience;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phoneNumber, name, yearsOfExperience);
    }
}
