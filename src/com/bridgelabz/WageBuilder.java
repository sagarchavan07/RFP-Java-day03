package com.bridgelabz;

public interface WageBuilder {
    public enum Attendance{
        IS_FULL_TIME,IS_PART_TIME
    }
    void wageBuilder(CompanyEmpWage company);
    Attendance checkAttendance();
}
