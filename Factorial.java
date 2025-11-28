/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorial;

import java.util.Scanner;

/**
 *
 * @author Eren
 */
public class Factorial {
    //Method that calculates factorial
    public static int factoriel (int number){
    int result=1;
            for (int i = 1; i <=number; i++) {
            result=result*i;
            }
            return result;
}

    public static void main(String[] args) {
        //Here we want the user to enter a number
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number to find the factorial value:");
        int number =input.nextInt(); 
        
        //The number given in factorials must be greater than zero.
        if (number>=0){
            System.out.println(number + "! = " + factoriel (number));
        }else{
            System.out.println("Factorial is not defined for negative numbers!!");           
        }
    }
}
