package com.bridgelabz;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        int attendance;

        System.out.println("Welcome to Employee Wage Computation");
        attendance=checkAttendance();
        if (attendance == 1) {
            System.out.println("Employee is Present");
        }else
            System.out.println("Employee is Absent");
    }
    static int checkAttendance(){
        int random=(int)(Math.random()*10)%2;
        return random;
    }
}
