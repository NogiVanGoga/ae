package com.company;

import java.util.Scanner;

public class Cat {
    static void display(){
        Scanner sc = new Scanner(System.in);
        String cat = sc.nextLine();
        System.out.println("Кота зовут - " + cat);
    }
}
