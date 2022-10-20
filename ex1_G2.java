package org.example;
import java.util.*;
import java.math.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ROOT);;
        String ans = "";
        double altura=0;
        double peso=0;
        do
        {
            System.out.println("\nInsira o seu peso em kg (pode conter duas casas decimais)");
            peso=scanner.nextDouble();
            System.out.println("\n Insira a sua altura em M");
            altura= scanner.nextDouble();
            System.out.println("O seu IMC é: "+(peso/(Math.pow(altura,2))));
            System.out.println("Repetir? (s/n)");
            ans = scanner.next().toLowerCase();
        } while (ans.equals("s"));
    }
}
