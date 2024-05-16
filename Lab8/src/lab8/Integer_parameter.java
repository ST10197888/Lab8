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
public class Integer_parameter
{
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    
    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println("The sum is: " + result);
    }
}