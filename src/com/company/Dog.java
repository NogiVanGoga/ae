package com.company;

import java.util.Scanner;

public class Dog extends Animal{
    String d;
    Dog(){
        d="Барбоскин";
    }

    @Override
    void makeSound() {
        System.out.println("Гав " + d);
    }
}
