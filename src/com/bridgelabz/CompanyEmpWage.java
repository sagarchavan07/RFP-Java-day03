package com.bridgelabz;

public class CompanyEmpWage {
    String companyName;
    static final int FULL_DAY_HOUR=10;
    static final int PART_TIME_HOUR=5;
    int wagePerHour;
    int maxWorkingDays;
    int maxWorkingHours;
    int totalWage;
    int totalWorkingHrs;

    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                "companyName='" + companyName + '\'' +
                ", wagePerHour=" + wagePerHour +
                ", maxWorkingDays=" + maxWorkingDays +
                ", maxWorkingHours=" + maxWorkingHours +
                ", totalWage=" + totalWage +
                ", totalWorkingHrs=" + totalWorkingHrs +
                '}';
    }
}
