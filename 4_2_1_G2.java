package org.example;
import java.util.*;
import java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        double certas=0;
       Scanner scanner= new Scanner(System.in).useLocale(Locale.ROOT);
       System.out.println("Insira um numero minino");
       int a = scanner.nextInt()-1;
        System.out.println("Insira um numero maximo");
        int b = scanner.nextInt()+1;

       for(int sum=0;sum!=10;sum++) {
           Random r = new Random();
           int result = r.nextInt(b-a) + a;

           System.out.println("Advinhe o numero");
           int c= scanner.nextInt();

           if(result==c)
           {
               System.out.println("Esta certo");
               certas++;
           }
           else
           {
               System.out.println("Esta errado");
           }
       }
        System.out.println("Acertaste "+certas+"("+((certas/10)*100)+"%)");
        System.out.println("Erraste "+(10-certas)+"("+(((10-certas)/10))*100+"%)");
    }
}
