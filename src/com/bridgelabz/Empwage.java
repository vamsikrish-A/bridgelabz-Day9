package com.bridgelabz;

public class Empwage {

    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOURS = 4;

    public static void main(String[] args) {
        System.out.println("Welcomr to Employee Wage.");

        int partTime = 1;
        int fullTIme = 2;
        int empHours = 0;

        double Checkout = Math.floor(Math.random() * 10) % 3;
        if (Checkout == fullTIme) {
            System.out.println("Employee Present.");
            empHours = FULL_DAY_HOUR;
        } else if (Checkout == partTime){
            System.out.println("Part-time Employee.");
            empHours = PART_TIME_HOURS;
        } else {
            System.out.println("Employee absent.");
            empHours = 0;
        }

        int dailyWage = empHours * WAGE_PER_HOUR;
        System.out.println("Daily employee Wage::" +dailyWage);
    }
}
