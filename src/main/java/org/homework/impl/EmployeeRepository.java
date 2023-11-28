package org.homework.impl;

import java.util.ArrayList;

public interface EmployeeRepository <E>{


    void add(E employee);

    E findByExperience (byte expAmount);
    E findPhoneByName(String phoneNumber);
    E findById(int id);
    ArrayList<E> getAll();

}
