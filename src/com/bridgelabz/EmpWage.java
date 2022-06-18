package com.bridgelabz;

public class EmpWage {
    public static void main(String[] args) {

        int isFULL_TIME = 1;
        double empcheck = (int) (Math.random() * 100) % 2;
        if (empcheck == isFULL_TIME) {

            System.out.println("Employee is Present");
        }
        else

            System.out.println("Employee is Absent");

    }
}

