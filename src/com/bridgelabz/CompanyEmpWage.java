package com.bridgelabz;

public class CompanyEmpWage {
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
    Attendance checkAttendance(){
        int random=(int)(Math.random()*10)%3;
        return (random== Attendance.IS_FULL_TIME.ordinal()) ? Attendance.IS_FULL_TIME: Attendance.IS_PART_TIME;
    }
}