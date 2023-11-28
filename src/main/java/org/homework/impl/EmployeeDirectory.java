package org.homework.impl;

import org.homework.entity.Employee;

import java.util.ArrayList;

public class EmployeeDirectory implements EmployeeRepository {
    private ArrayList<Employee> employees;

    public EmployeeDirectory() {
        employees = new ArrayList<>();
    }

    @Override
    public void add(Object o) {
        employees.add((Employee) o);
    }

    @Override
    public Employee findByExperience(int expAmount) {
        for (Employee employee : employees) {
            return employee;
        }
        return null;
    }

    @Override
    public String findPhoneByName(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee.getPhoneNumber();
            }
        }
        return null;
    }

    @Override
    public Employee findById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public ArrayList getAll() {
        return employees;
    }
}
