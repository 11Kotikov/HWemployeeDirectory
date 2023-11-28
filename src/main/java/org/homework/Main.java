package org.homework;

import org.homework.entity.Worker;
import org.homework.impl.EmployeeDirectory;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();

        Worker OfficeWorker1 = new Worker("Jim", "89023457777", 5);
        Worker OfficeWorker2 = new Worker("Pam", "89099457771", 6);
        Worker OfficeWorker3 = new Worker("Dwight", "89023458973", 6);

        employeeDirectory.add(OfficeWorker1);
        employeeDirectory.add(OfficeWorker2);
        employeeDirectory.add(OfficeWorker3);

        System.out.println(employeeDirectory.findPhoneByName("Jim"));
        System.out.println(employeeDirectory.findPhoneByName("Pam"));
        System.out.println(employeeDirectory.findPhoneByName("Dwight"));
        System.out.println(employeeDirectory.findPhoneByName("Michael"));
        System.out.println(employeeDirectory.findById(2));
        System.out.println(employeeDirectory.findByExperience(5));
        System.out.print(employeeDirectory.getAll());
    }

}