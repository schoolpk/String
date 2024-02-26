package com.tn;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static String capitalize(String inputString) {


        char firstLetter = inputString.charAt(0);


        char capitalFirstLetter = Character.toUpperCase(firstLetter);


        return inputString.replace(inputString.charAt(0), capitalFirstLetter);
    }
    public static void main(String[] args) {
//        string courseName = "java core with database"
//        length: đếm số ký tự
//        int value = courseName.length()
//
//        System.out.println(courseName.substring(0, 2)): cắt chuỗi => kết quả "ja"

        //Bài 1 String: tất cả đều viết hoa
        Scanner sc = new Scanner(System.in);
        String Name1 = sc.nextLine();
        System.out.println(Name1.toUpperCase());
        //Bài 2 String: chỉ chữ cái đầu viết hoa

        //Bài 3 String: thay "n" và "g" thành "a"
        sc = new Scanner(System.in);
        String Name3 = sc.nextLine();
        System.out.println(Name3.replaceAll("n" , "a").replaceAll("g", "a"));



    }
}
