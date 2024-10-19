package com.example.project;

public class Runner {
    public static void main(String[] args) {
        LinearCalculator lin = new LinearCalculator("(10,5)", "(6,-1)");
        System.out.println(lin.printInfo());
    }
}
