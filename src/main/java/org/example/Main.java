package org.example;
import java.util.Scanner;

public class Main { // Example usage for Person constructor (try a negative number)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println("Give me a name: ");
        String name = sc.nextLine();
        System.out.println("Give me a age: ");
        int age = sc.nextInt();
        Person person = new Person(age,name);
        System.out.println("Person created: " + person);
    }
}