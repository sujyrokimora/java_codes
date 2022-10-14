package org.example;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        //mes();//maneira merda
        String[] b ={"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};//array with all the months in portuguese
        Scanner input = new Scanner(System.in);
        int c= input.nextInt();//ask for an input
        System.out.println(b[c-1]);// says the month based on the array
    }

    public static void mes()//shitty method
    {
        Scanner input = new Scanner(System.in);
        int a= input.nextInt();
        switch (a) {//prints the month based on the input
            case 1 -> System.out.println("Janeiro");
            case 2 -> System.out.println("Fevereiro");
            case 3 -> System.out.println("Março");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Maio");
            case 6 -> System.out.println("Junho");
            case 7 -> System.out.println("Julho");
            case 8 -> System.out.println("Agosto");
            case 9 -> System.out.println("Setembro");
            case 10 -> System.out.println("Outubro");
            case 11 -> System.out.println("Novembro");
            case 12 -> System.out.println("Dezembro");
            default -> mes();//the function recalls itself if input is invalid
        }
    }
}
