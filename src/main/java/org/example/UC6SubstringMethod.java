package org.example;

public class UC6SubstringMethod {
    public static void main(String[] args) {

        String text = "HelloWorld";

        String part1 = text.substring(0, 5);
        String part2 = text.substring(5);

        System.out.println("Original String: " + text);
        System.out.println("Substring (0 to 5): " + part1);
        System.out.println("Substring (5 to end): " + part2);
    }
}