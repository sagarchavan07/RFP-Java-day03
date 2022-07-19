package com.bridgelabz;

public class EmployeeWageComputationMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        System.out.println("Employee Wage Computation for company1");
        CompanyEmpWage company1=new CompanyEmpWage();
        company1.companyName="company1";
        company1.wagePerHour=20;
        company1.maxWorkingDays=20;
        company1.maxWorkingHours=150;

        WageBuilder empWageBuilder=new EmpWageBuilder();
        empWageBuilder.wageBuilder(company1);
        System.out.println("Total Wage of company1= "+company1.totalWage);

        System.out.println("*********************************************\n"
                +"Employee Wage Computation for company2");
        CompanyEmpWage company2=new CompanyEmpWage();
        company2.companyName="company2";
        company2.wagePerHour=25;
        company2.maxWorkingDays=23;
        company2.maxWorkingHours=160;

        empWageBuilder.wageBuilder(company2);
        System.out.println("Total Wage of company1= "+company2.totalWage);

        System.out.println("***********************************");
        for (String key: CompanyEmpWage.CompanyEmpWageList.keySet()) {
            System.out.println(CompanyEmpWage.CompanyEmpWageList.get(key).toString());;
        }
    }

}