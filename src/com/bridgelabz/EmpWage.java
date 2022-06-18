package com.bridgelabz;

public class EmpWage {
    public static void main(String[] args) {

        final int isPART_TIME = 1;
        final int isFULL_TIME = 2;
        final int Emp_Rate_Per_Hr = 20;
        int empCheck = (int) (Math.random() * 100) % 3;
        int workingHours =0;
        switch (empCheck)
        {
            case isFULL_TIME:
                System.out.println("Employee is Present Full time");
                workingHours = 8;
                break;
            case isPART_TIME:
                System.out.println("Employee is Present Part time");
                workingHours = 4;
                break;
            default:
                System.out.println("Employee is Absent");
        }
        int wage = workingHours * Emp_Rate_Per_Hr;
        System.out.println("Employee Daily Wage is " + wage);
    }
}

