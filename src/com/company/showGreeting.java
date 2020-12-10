package com.company;
import java.util.Scanner;
public class showGreeting {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("pleas insert your name");
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}