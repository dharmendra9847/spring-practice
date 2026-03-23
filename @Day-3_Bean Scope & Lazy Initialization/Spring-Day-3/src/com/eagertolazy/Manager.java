package com.eagertolazy;

import java.util.Scanner;

public class Manager {

    static {
        IO.println("Hello Manager static!");
    }

    public Manager() {
        IO.println("Hello Manager constructor!");
    }

    public String permission() {

        Scanner sc = new Scanner(System.in);
        IO.println("Enter your key:");
        int key = sc.nextInt();
        if (key == 1111) {
            return  "admin";
        }else {
            return "not admin";
        }
    }
}
