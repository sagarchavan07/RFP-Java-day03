package com.bridgelabz;

public class EmployeeWageComputation {

    static final int IS_FULL_TIME=2;
    static final int IS_PART_TIME=1;
    static final int WAGE_PER_HOUR=20;
    static final int FULL_DAY_HOUR=10;
    static final int PART_TIME_HOUR=5;
    static final int MAX_HOURS=100;
    static final int MAX_DAYS=20;
    public static void main(String[] args) {
        int attendance;
        int dailyWage=0;
        int day=1;
        int totalWage=0;
        int totalWorkingHrs=0;

        System.out.println("Welcome to Employee Wage Computation");

        while (day <=MAX_DAYS && totalWorkingHrs<MAX_HOURS) {
            attendance = checkAttendance();

            switch (attendance) {
                case IS_FULL_TIME:
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    totalWorkingHrs+=FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                    totalWorkingHrs+=PART_TIME_HOUR;
                    break;
                default:
                    break;
            }

            totalWage+=dailyWage;
            System.out.println("Daily Wage day #"+day+" = "+ dailyWage);
            day++;
        }
        System.out.println();
        System.out.println("Total Days = "+(day-1));
        System.out.println("Total Working Hours = "+totalWorkingHrs);
        System.out.println("Total Wage of month= "+totalWage);

    }
    static int checkAttendance(){
        int random=(int)(Math.random()*10)%3;
        return random;
    }
}
