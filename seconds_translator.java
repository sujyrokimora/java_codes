package org.example;
import java.util.*;
import java.math.*;
import java.time.*;


public class Main {
    public static void main(String[] args) {
        time();

    }
    public static void time() {
        System.out.println("\n Insert a time using : to separate it (format HH:mm:ss)");
        String time= scanner.next();
        String[] fulltime= time.split(":");
        if ((fulltime.length<=1)||(fulltime.length>3)) {
            System.out.println("\n Invalid time please, try again!");
            time();
        }
        else{
            // position 0 is equivalent to hour
            // position 1 is equivalent to minute
            // position 2 is equivalent to second
            int fullseconds=(Integer.parseInt(fulltime[0])*3600)+ (Integer.parseInt(fulltime[1])*60)+ Integer.parseInt(fulltime[2]);
            System.out.println("\n This is equal to "+fullseconds+ "seconds");
        }
    }
    public static Scanner scanner = new Scanner(System.in).useLocale(Locale.ROOT);
}
