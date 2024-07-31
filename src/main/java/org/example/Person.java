package org.example;

public class Person {
    int age;
    String name;

    public Person(int age, String name) {
        try{
            if(age < 0 || age > 120) {
                throw new IllegalArgumentException("Age must be between 0 and 120");
            }
            else if(name == null || name.isEmpty() || name.length() > 40) {
                throw new IllegalArgumentException("Name must be between 0 and 40 characters");
            }
            else{
                this.age = age;
                this.name = name;
            }
        }catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(1);
        }
    }
}
