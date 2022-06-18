package com.bridgelabz;

import java.util.Random;

public class EmpWage {
    public final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    private int EMP_RATE_PER_HOURS;
    private int NUM_OF_WORKING_DAYS;
    private int MAX_HRS_IN_MONTH;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage using OOPs concept");
        EmpWage empWage = new EmpWage();
        empWage.computeWage("AMAZON",20,20,100);
        empWage.computeWage("FLIPCART",10,15,100);
    }


    public void computeWage(String company,int empRatePerHour,int numberOfWorkingDays,int maxHrs) {
        this.EMP_RATE_PER_HOURS = empRatePerHour;
        this.NUM_OF_WORKING_DAYS = numberOfWorkingDays;
        this.MAX_HRS_IN_MONTH = maxHrs;
        int empHours;
        int empwage = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        int totalEmpwage = 0;



        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int)(Math.floor(Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }
            totalEmpHrs += empHours;
            empwage = empHours * EMP_RATE_PER_HOURS;
            System.out.println("Day" + totalWorkingDays + "Emp Hrs: " + empHours + "Emp Wage: " + empwage);
            totalEmpwage += empwage;
        }
        totalEmpwage = totalEmpHrs * EMP_RATE_PER_HOURS;
        System.out.println("Total Emp Wage of an employee in " + company + "is" + totalEmpwage);

    }
}


