package com.bridgelabz;

public class Empwage {

    public static final int FULL_DAY_HOURS = 2;
    public static final int PART_TIME_HOURS = 1;
    /* Instance Variables */
    private final String company;
    private final int wagePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    public Empwage (String company, int wagePerHour, int numOfWorkingDays, int maxHrsPerMonth) {
        this.company = company;
        this.maxHoursPerMonth = maxHrsPerMonth;
        this.numOfWorkingDays = numOfWorkingDays;
        this.wagePerHour = wagePerHour;
    }
    public void empWageSystem( ) {
        int empHours = 0, totalHrs = 0, totalWorkingDays = 0;
        while (totalHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
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
            totalHrs += empHours;
            System.out.println("Day#:"+totalWorkingDays + " Emp hr:"+empHours);

        }
        totalEmpWage = totalHrs * wagePerHour;
    }

    @Override
    public String toString() {
        return "Total Emp Wage for Company: " +company+ " is: " +totalEmpWage;
    }

    public static void main(String[] args) {
        Empwage samSung = new Empwage("SAMSUNG",20, 25, 90);
        Empwage noKia = new Empwage("NOKIA", 25, 25, 80);

        samSung.empWageSystem();
        System.out.println(samSung);

        noKia.empWageSystem();
        System.out.println(noKia);
    }
}
