package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;

public class EmpWageBuilder implements WageBuilder{
    public void wageBuilder(CompanyEmpWage company){
        Attendance attendance;
        int dailyWage=0;
        int day=1;
        company.DailyWage=new float[company.maxWorkingDays];

        while (day <= company.maxWorkingDays && company.totalWorkingHrs< company.maxWorkingHours) {
            attendance = checkAttendance();

            switch (attendance) {
                case IS_FULL_TIME:
                    if (company.totalWorkingHrs+  company.FULL_DAY_HOUR <= company.maxWorkingHours) {
                        dailyWage = company.wagePerHour * company.FULL_DAY_HOUR;
                        company.totalWorkingHrs += company.FULL_DAY_HOUR;
                    }else {
                        dailyWage = company.wagePerHour * company.PART_TIME_HOUR;
                        company.totalWorkingHrs+=company.PART_TIME_HOUR;
                    }
                    break;
                case IS_PART_TIME:
                    dailyWage = company.wagePerHour * company.PART_TIME_HOUR;
                    company.totalWorkingHrs+=company.PART_TIME_HOUR;
                    break;
                default:
                    break;
            }
            company.totalWage+=dailyWage;
            company.DailyWage[(day-1)]=dailyWage;
//            System.out.println("day "+day+" wage= "+ dailyWage);
            day++;
        }
        System.out.println("Total Days = "+(day-1));
        System.out.println("Total Working Hours = "+company.totalWorkingHrs);

        company.CompanyEmpWageList.put(company.companyName,company);
    }
    public Attendance checkAttendance(){
        int random=(int)(Math.random()*10)%3;
        return (random== Attendance.IS_FULL_TIME.ordinal()) ? Attendance.IS_FULL_TIME: Attendance.IS_PART_TIME;
    }
}
