package com.bridgelabz;

public class EmployeeWageComputation {
    public enum Attendance{
        IS_FULL_TIME,IS_PART_TIME
    }
    static final int FULL_DAY_HOUR=10;
    static final int PART_TIME_HOUR=5;
    int totalWage=0;
    int totalWorkingHrs=0;
    int wagePerHour;
    int maxWorkingDays;
    int maxWorkingHours;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        System.out.println("Employee Wage Computation for company1");
        EmployeeWageComputation company1=new EmployeeWageComputation();
        company1.wagePerHour=20;
        company1.maxWorkingDays=20;
        company1.maxWorkingHours=150;
        company1.empWageBuilder();
        System.out.println("Total Wage of company1= "+company1.totalWage);

        System.out.println("*********************************************\n"
                +"Employee Wage Computation for company2");
        EmployeeWageComputation company2=new EmployeeWageComputation();
        company2.wagePerHour=25;
        company2.maxWorkingDays=23;
        company2.maxWorkingHours=160;
        company2.empWageBuilder();
        System.out.println("Total Wage of company1= "+company2.totalWage);
    }

    int empWageBuilder(){
        Attendance attendance;
        int dailyWage=0;
        int day=1;


        while (day <= maxWorkingDays && totalWorkingHrs< maxWorkingHours) {
            attendance = checkAttendance();

            switch (attendance) {
                case IS_FULL_TIME:
                    if (totalWorkingHrs+FULL_DAY_HOUR <= maxWorkingHours) {
                        dailyWage = wagePerHour * FULL_DAY_HOUR;
                        totalWorkingHrs+=FULL_DAY_HOUR;
                    }else {
                        dailyWage = wagePerHour * PART_TIME_HOUR;
                        totalWorkingHrs+=PART_TIME_HOUR;
                    }
                    break;
                case IS_PART_TIME:
                    dailyWage = wagePerHour * PART_TIME_HOUR;
                    totalWorkingHrs+=PART_TIME_HOUR;
                    break;
                default:
                    break;
            }
            totalWage+=dailyWage;
//            System.out.println("day "+day+" wage= "+ dailyWage);
            day++;
        }
        System.out.println();
        System.out.println("Total Days = "+(day-1));
        System.out.println("Total Working Hours = "+totalWorkingHrs);
        return totalWage;
    }
    static Attendance checkAttendance(){
        int random=(int)(Math.random()*10)%3;
        return (random==Attendance.IS_FULL_TIME.ordinal()) ? Attendance.IS_FULL_TIME: Attendance.IS_PART_TIME;
    }

}