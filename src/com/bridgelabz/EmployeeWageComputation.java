package com.bridgelabz;

public class EmployeeWageComputation {
    public enum Attendance{
        IS_FULL_TIME,IS_PART_TIME
    }
    static final int FULL_DAY_HOUR=10;
    static final int PART_TIME_HOUR=5;
    static final int MAX_HOURS=100;
    static final int MAX_DAYS=20;
    static int wagePerHour;


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        EmployeeWageComputation.getEmployeeWage();
    }

    static void getEmployeeWage(){
        Attendance attendance;
        int dailyWage=0;
        int day=1;
        int totalWage=0;
        int totalWorkingHrs=0;

        while (day <=MAX_DAYS && totalWorkingHrs<MAX_HOURS) {
            attendance = checkAttendance();

            switch (attendance) {
                case IS_FULL_TIME:
                    if (totalWorkingHrs+FULL_DAY_HOUR <= MAX_HOURS) {
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
            System.out.println("day "+day+" wage= "+ dailyWage);
            day++;
        }
        System.out.println();
        System.out.println("Total Days = "+(day-1));
        System.out.println("Total Working Hours = "+totalWorkingHrs);
        System.out.println("Total Wage of month= "+totalWage);

    }
    static Attendance checkAttendance(){
        int random=(int)(Math.random()*10)%3;
        return (random==Attendance.IS_FULL_TIME.ordinal()) ? Attendance.IS_FULL_TIME: Attendance.IS_PART_TIME;
    }

}