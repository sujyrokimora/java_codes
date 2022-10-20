package org.example;
import java.util.*;
import java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        double d= Math.pow(b,2) - 4.0 * a * c;
        if (d> 0.0)
        {
            double r1 = (-b + Math.sqrt(d) / (2.0 * a));
            //double r1 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c) / (2.0 * a));
            //double r2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c) / (2.0 * a)));
            double r2 = (-b - Math.sqrt(d) / (2.0 * a));
            System.out.println("The roots are " + r1 + " and " + r2);
        }
        else if (d == 0.0)
        {
            double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        }
        else
        {
            System.out.println("Roots are not real.");
        }
    }
}
