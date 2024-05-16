/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author kenne
 */
public class Natural_num
{
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the first integer: ");
        int number1 = scanner.nextInt();


        System.out.print("Enter the second integer: ");
        int number2 = scanner.nextInt();

        int sum = number1 + number2;

       
        System.out.println("The sum of " + number1 + " and " + number2 + " is " + sum);
    }
}