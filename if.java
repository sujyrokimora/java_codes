«package org.example;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int a= input.nextInt();

        if(a>10)//if bigger than 10 runs the print
        {
            System.out.println("É maior");
        }
        else if(a==10)// if equals to 10
        {
            System.out.println("É igual");

        }
        else// any other case
        {
            System.out.println("É menor");
        }


    }
}
