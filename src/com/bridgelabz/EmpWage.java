package com.bridgelabz;

public class EmpWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;

    public EmpWage() {
        companyEmpWageArray = new CompanyEmpWage[2];
    }


    public void addCompanyEmpWage(String companyName, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth) {
        companyEmpWageArray[numOfCompany] = new CompanyEmpWage(companyName, empRatePerHr, numOfWorkingDays, maxHoursPerMonth);
        numOfCompany++;
    }

    public void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    public int computeEmpWage(CompanyEmpWage companyEmpWage) {

        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalEmpWage = 0;
        int totalWorkingDays = 0;

        while (totalWorkingDays <= companyEmpWage.getNumOfWorkingDays() && totalEmpHrs < companyEmpWage.getMaxHoursPerMonth()) {
            totalWorkingDays++;
            double empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch ((int) empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            int empWage = empHrs * companyEmpWage.getEmpRatePerHr();
            totalEmpHrs += empHrs;
            totalEmpWage += empWage;
        }
        return totalEmpWage;
    }

    public static void main(String[] args) {
        EmpWage empWage = new EmpWage();
        System.out.println("Welcome to EmployeeWage");
        empWage.addCompanyEmpWage("AMAZON", 20, 20, 100);
        empWage.addCompanyEmpWage("FLIPKART", 10, 15, 100);
        empWage.computeEmpWage();
    }
}



