import java.util.*;

import static java.lang.Math.*;


public class main {
    public static void main(String[] args)
    {

        //byte test=100;
        //System.out.println(test);
        //aula2.teste();//chama o aula2.java

        System.out.println("IPBeja-ESTIG");
        System.out.println("\n");

        // raiz de um numero
       //System.out.println("A raiz quadrada é"+sqrt(raiz()));

        // isto ta tudo ligado ao quadrado
       /* int c= square();
       System.out.println("O quadrado desse é: "+ c*c);*/


         int[] c= quadradocustom();
         System.out.println("O numero "+ c[0]+" elevado a "+ c[1]+" é "+ pow(c[0],c[1]));



    }

    public static int raiz()//square root of an number
    {
        int a=0;
        System.out.println("Escolha um numero tipo inteiro:");
        try {//tries to get a value from the user
            Scanner myobj = new Scanner(System.in);
            a = Integer.parseInt(myobj.nextLine());
        }//if the user gives an invalid value this will run
        catch(Exception e) {
            System.out.println("Eu disse inteiro");
            raiz();//the function calls it self
        }
        //System.out.println(a);
        return a;
    }

    public static int square()//square of an number
    {
        int b=0;
        System.out.println("Escolha um numero tipo inteiro:");
        try {//tries to get a value from the user
            Scanner myobj = new Scanner(System.in);
            b = Integer.parseInt(myobj.nextLine());
        }//if the user gives an invalid value this will run
        catch(Exception e) {
            System.out.println("Eu disse inteiro");
            square();//the function calls it self
        }
        //System.out.println(a);
        return b;
    }

    public static int[] quadradocustom()//user chosses the power
    {
        int e=0;
        int f=0;

        try {//tries to get a value from the user
            System.out.println("Escolha um numero tipo inteiro");
            Scanner myobj = new Scanner(System.in);
            e = Integer.parseInt(myobj.nextLine());
            System.out.println("Escolha outro numero");
            Scanner myobj2 = new Scanner(System.in);
            f = Integer.parseInt(myobj2.nextLine());
        }//if the user gives an invalid value this will run
        catch(Exception err) {
            System.out.println("Eu disse inteiro");
            quadradocustom();//the function calls it self
        }
        //System.out.println(a);

        return new int[]{e,f};
    }

}
