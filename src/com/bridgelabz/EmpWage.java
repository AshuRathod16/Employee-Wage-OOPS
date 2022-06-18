package com.bridgelabz;

public class EmpWage {
    public static void main(String[] args) {

        int isPART_TIME = 1;
        int isFULL_TIME = 2;
        int Emp_Rate_Per_Hr = 20;
        int empcheck = (int) (Math.random() * 100) % 3;
        int workingHours = 0;
        if (empcheck == isFULL_TIME) {
            System.out.println("Employee is Present Full time");
            workingHours = 8;
        } else if (empcheck == isPART_TIME) {
            System.out.println("Employee is Present Part time");
            workingHours = 4;
        } else

            System.out.println("Employee is Absent");

        int wage = workingHours * Emp_Rate_Per_Hr;
        System.out.println("Employee Daily Wage is " + wage);

    }
}

