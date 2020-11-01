package com.company;

import java.util.Scanner;

public class Dog {
    static void display(){
        Scanner sc = new Scanner(System.in);
        String dog = sc.nextLine();
        System.out.println("Собаку зовут - " + dog);
    }
}
