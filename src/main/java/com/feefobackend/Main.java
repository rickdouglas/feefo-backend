package com.feefobackend;

public class Main {
    public static void main(String[] args) {
        Normaliser normaliser = new Normaliser();

        // Sample inputs and expected outputs
        String[] jobTitles = {"Java engineer", "C# engineer", "Accountant", "Chief Accountant", "123 Developer", "Lead Engineer"};
        String[] expectedOutputs = {"Software engineer", "Software engineer", "Accountant", "Accountant", "123 Developer", "Lead Engineer"};

        for (int i = 0; i < jobTitles.length; i++) {
            String normalizedTitle = normaliser.normalise(jobTitles[i]);
            System.out.println("Input: " + jobTitles[i]);
            System.out.println("Normalized: " + normalizedTitle);
            System.out.println("Expected: " + expectedOutputs[i]);
            System.out.println((normalizedTitle == null && expectedOutputs[i] == null) || (normalizedTitle != null && normalizedTitle.equals(expectedOutputs[i])) ? "Test Passed" : "Test Failed");
            System.out.println();
        }
    }
}