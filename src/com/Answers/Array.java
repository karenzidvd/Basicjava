package com.Answers;

public class Array {
    public static void main(String[] args) {
        // Initialize an array
        int[] originalArray = {1, 2, 3, 4, 5};

        // Double each element in the array
        int[] doubledArray = doubleArrayElements(originalArray);

        // Print the original and modified arrays
        System.out.println("Original Array:");
        printArray(originalArray);

        System.out.println("\nDoubled Array:");
        printArray(doubledArray);
    }

    // Method to double each element in the array
    private static int[] doubleArrayElements(int[] array) {
        int[] doubledArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            doubledArray[i] = array[i] * 2;
        }
        return doubledArray;
    }

    // Method to print the elements of an array
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
