package com.bridgelabz;

public class EmployeeWageComputation {
    static int WAGE_PER_HOUR=20;
    static int FULL_DAY_HOUR=10;
    static int PART_TIME_HOUR=8;
    public static void main(String[] args) {
        int attendance;
        int dailyWage=0;

        System.out.println("Welcome to Employee Wage Computation");
        attendance=checkAttendance();
//        if (attendance == 2) {
//            System.out.println("Employee is full time");
//            dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
//        }else if (attendance == 1) {
//            System.out.println("Employee is part time");
//            dailyWage=WAGE_PER_HOUR*PART_TIME_HOUR;
//        }else
//            System.out.println("Employee is Absent");

        switch (attendance){
            case 2:
                System.out.println("Employee is full time");
                dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
                break;
            case 1:
                System.out.println("Employee is part time");
                dailyWage=WAGE_PER_HOUR*PART_TIME_HOUR;
                break;
            case 0:
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
