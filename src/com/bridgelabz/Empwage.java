package com.bridgelabz;

public class Empwage {

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOURS = 2;
    public static final int PART_TIME_HOURS = 1;
    public static final int NUM_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {
        System.out.println("Welcomr to Employee Wage.");

        int empHours = 0, empWagePerMonth = 0;
        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            int checkOut = (int) Math.floor(Math.random() * 10) % 3;
            switch (checkOut) {
                case FULL_DAY_HOURS:
                    empHours = 8;
                    break;
                case PART_TIME_HOURS:
                    empHours = 4;
                    break;
                default:
                    empHours = 0;
            }
            int dailyWage = empHours * WAGE_PER_HOUR;
            empWagePerMonth += dailyWage;
            System.out.println("Employee Wage "+day+" is ::"+dailyWage);
        }
        System.out.println("Employee per month::"+empWagePerMonth);

    }
}
