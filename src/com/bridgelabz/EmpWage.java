package com.bridgelabz;

public class EmpWage {
    public static void main(String[] args) {

        final int isPART_TIME = 1;
        final int isFULL_TIME = 2;
        final int Emp_Rate_Per_Hr = 20;
        final int WORKING_DAYS = 20;

        int totalWage = 0;
        for (int day = 1; day <= WORKING_DAYS; day++)
        {
            int empCheck = (int) (Math.random() * 100) % 3;
            int workingHours =0;
            switch (empCheck)
            {
                case isFULL_TIME:
                    workingHours = 8;
                    break;
                case isPART_TIME:
                    workingHours = 4;
                    break;
                default:
            }
            int wage = workingHours * Emp_Rate_Per_Hr;
            System.out.println("Day" + day + " wage is:" + wage);
            totalWage +=wage;
        }
        System.out.println("Total wage for a month is " + totalWage);
    }
}

