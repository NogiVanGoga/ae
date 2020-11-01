package com.company;

import java.util.Scanner;

public class Cat extends Animal{
    String c;
    Cat(){
        c="Матроскин";
    }

    @Override
    void makeSound() {
        System.out.println("Мяу " + c);
    }
}
