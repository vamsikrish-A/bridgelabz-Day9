package com.bridgelabz;

public class Empwage {
    public static void main(String[] args) {
        System.out.println("Welcomr to Employee Wage.");

        double Checkout = Math.floor(Math.random() * 10) % 2;
        if (Checkout == 1)
            System.out.println("Employee Present.");
        else
            System.out.println("Employee absent.");
    }
}
