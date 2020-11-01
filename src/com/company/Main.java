package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Man man =new Man();
        Cat cat =new Cat();
        Dog dog =new Dog();
        man.display();
        System.out.print("Как зовут кота?\nКак зовут собаку?");
        cat.display();
        dog.display();
    }
}
