package com.example.ecommerce.login.model;

import java.util.Scanner;

/**
 * @author dangal_nirajan on 29/11/2022
 */
public class Exception {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        try{
            int c = a/b;
            System.out.println("The division is " +c);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot be divided by zero");
        }
    }
}
