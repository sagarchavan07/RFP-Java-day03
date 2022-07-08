package com.bridgelabz;

public class EmployeeWageComputation {
    static int WAGE_PER_HOUR=20;
    static int FULL_DAY_HOUR=10;
    public static void main(String[] args) {
        int attendance;
        int dailyWage=0;

        System.out.println("Welcome to Employee Wage Computation");
        attendance=checkAttendance();
        if (attendance == 1) {
            System.out.println("Employee is Present");
            dailyWage=WAGE_PER_HOUR*FULL_DAY_HOUR;
        }else
            System.out.println("Employee is Absent");

        System.out.println("Daily Wage = "+dailyWage);
    }
    static int checkAttendance(){
        int random=(int)(Math.random()*10)%2;
        return random;
    }
}
