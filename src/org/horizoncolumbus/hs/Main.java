package org.horizoncolumbus.hs;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Name:");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Age:");
        int age = input.nextInt();
        System.out.println("Height:");
        double height = input.nextDouble();

        System.out.println(name + " is a new user." + name + " is " + age + " years old and has a height of " + height + " feet!");
        input.close();
    }
}
