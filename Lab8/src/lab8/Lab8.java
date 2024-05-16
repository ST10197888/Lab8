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
public class Rectangle {
    private double length
    private double width;

    public Rectangle(double L, double W) {
        this.length = L;
        this.width = W;
    }

    public double Area() {
        return length * width;
    }

  //method: 
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area of the rectangle: " + rectangle.Area());
    }
}
