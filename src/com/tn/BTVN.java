package com.tn;

import java.util.Locale;
import java.util.Scanner;

public class BTVN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Bài 1
        sc = new Scanner(System.in);
        String Name1 = sc.nextLine();
        System.out.println(Name1.toUpperCase());



        //Bài 2
        sc = new Scanner(System.in);
        String name2 = sc.nextLine();
        String[] n2 = name2.split(" ");
        String Name2 = "";
        for (String b2 : n2) {
            String b = b2.toLowerCase();
            String c = b.substring(0, 1).toUpperCase() + b.substring(1);
            Name2 = Name2 + c +" ";
        }
        System.out.println(Name2);




        //Bài 3
        sc = new Scanner(System.in);
        String Name3 = sc.nextLine();
        System.out.println(Name3.replaceAll("n" , "a").replaceAll("g", "a"));
    }
}
