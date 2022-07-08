package com.bridgelabz;

public class EmployeeWageComputation {

    static final int IS_FULL_TIME=2;
    static final int IS_PART_TIME=1;
    static final int WAGE_PER_HOUR=20;
    static final int FULL_DAY_HOUR=10;
    static final int PART_TIME_HOUR=8;
    public static void main(String[] args) {
        int attendance;
        int dailyWage=0;

        System.out.println("Welcome to Employee Wage Computation");
        attendance=checkAttendance();

//        if (attendance == IS_FULL_TIME) {
//            System.out.println("Employee is full time");
//            dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
//        }else if (attendance == IS_PART_TIME) {
//            System.out.println("Employee is part time");
//            dailyWage=WAGE_PER_HOUR*PART_TIME_HOUR;
//        }else
//            System.out.println("Employee is Absent");

        switch (attendance){
            case IS_FULL_TIME :
                System.out.println("Employee is full time");
                dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
                break;
            case IS_PART_TIME:
                System.out.println("Employee is part time");
                dailyWage=WAGE_PER_HOUR*PART_TIME_HOUR;
                break;
            default:
                System.out.println("Employee is Absent");
                break;
        }

        System.out.println("Daily Wage = "+dailyWage);
    }
    static int checkAttendance(){
        int random=(int)(Math.random()*10)%3;
        return random;
    }
}
