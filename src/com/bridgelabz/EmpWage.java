package com.bridgelabz;

public class EmpWage {
    public static void main(String[] args) {

        int isFULL_TIME = 1;
        int Emp_Rate_Per_Hr = 20;
        int empcheck = (int) (Math.random() * 100) % 2;
        int workingHours = 0;
        if (empcheck == isFULL_TIME) {

            System.out.println("Employee is Present");
            workingHours = 8;
        } else {
            System.out.println("Employee is Absent");
        }

        int dailywage = workingHours * Emp_Rate_Per_Hr;
        System.out.println("Employee Daily Wage is " + dailywage);

    }
}

