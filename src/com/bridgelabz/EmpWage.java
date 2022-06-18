package com.bridgelabz;

public class EmpWage {

//Initializing static variables
        public static final int IS_FULL_TIME = 1;
        public static final int IS_PART_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;
        public static final int WORKING_DAYS = 20;
        public static final int MAX_WORKING_HOURS = 100;

        public static void main(String[] args) {

          System.out.println("Welcome to Employee Wage Computation Program");

            //Initializing variables
            int totalEmpHours = 0;
            int empHours = 0;
            int totalWorkingDays = 0;
            int totalEmpWage = 0;

            /*Checking if the employee is full time working or part time or is absent using switch case*/
            while (totalEmpHours <= MAX_WORKING_HOURS && totalWorkingDays < WORKING_DAYS)
                for (int day = 0; day < WORKING_DAYS; day++) {
                    int empCheck = (int) Math.floor(Math.random() * 10) % 3;
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
                    totalEmpHours += empHours;
                    //Printing total working days and hours
                    System.out.println("DAY#:" + totalWorkingDays + "Emp hour:" + empHours);
                }
            //Calculating total employee wage and then printing it
            totalEmpWage += totalEmpHours * EMP_RATE_PER_HOUR;
            System.out.println("Employees's Total Wage is:" + totalEmpWage);
        }
    }


