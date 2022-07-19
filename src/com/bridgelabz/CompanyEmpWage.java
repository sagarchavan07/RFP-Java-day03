package com.bridgelabz;

import java.util.Arrays;
import java.util.HashMap;

public class CompanyEmpWage {
    String companyName;
    static final int FULL_DAY_HOUR=10;
    static final int PART_TIME_HOUR=5;
    int wagePerHour;
    int maxWorkingDays;
    int maxWorkingHours;
    int totalWage;
    int totalWorkingHrs;
    float [] DailyWage;
    static HashMap<String,CompanyEmpWage> CompanyEmpWageList=new HashMap<>();

    public CompanyEmpWage() {
    }

    public CompanyEmpWage(String companyName, int totalWage, float[] dailyWage) {
        this.companyName = companyName;
        this.totalWage = totalWage;
        DailyWage = dailyWage;
    }

    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                "companyName='" + companyName + '\'' +
                ", wagePerHour=" + wagePerHour +
                ", maxWorkingDays=" + maxWorkingDays +
                ", maxWorkingHours=" + maxWorkingHours +
                ", totalWage=" + totalWage +
                ", totalWorkingHrs=" + totalWorkingHrs +
                ", DailyWage=" + Arrays.toString(DailyWage) +
                '}';
    }
}
