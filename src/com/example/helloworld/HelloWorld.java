package com.example.helloworld;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // Create a Scanner object

        HelloWorld helloWorld = new HelloWorld();
        showMessage("Enter numbers with spaces to be able to sort below: ");
        int[] numbersToSort = receiveParseAndReturnArrayToQS(input);

        showMessage("BEFORE applying Quick Sort algorithm...");
        System.out.println(Arrays.toString(numbersToSort));

        helloWorld.quickSort(numbersToSort);

        showMessage("AFTER applying Quick Sort algorithm...");
        System.out.println(Arrays.toString(numbersToSort));
    }

    private static int[] receiveParseAndReturnArrayToQS(Scanner input) {
        String stringOfNumbers = input.nextLine();
        String[] numbersToParse = stringOfNumbers.split("\\s+");
        int[] myNumbersToSort = new int[numbersToParse.length];
        for (int i = 0; i < numbersToParse.length; i++) {
            myNumbersToSort[i] = Integer.parseInt(numbersToParse[i]);
        }

        for (int myNumber : myNumbersToSort) {
            System.out.println(myNumber);
        }
        return myNumbersToSort;
    }

    private static void showMessage(String msg) {
        System.out.println(msg);
    }

    public void quickSort(int[] arrayToQuickSort) {
        quickSort(arrayToQuickSort, 0, arrayToQuickSort.length - 1);
    }

    private void quickSort(int[] arrayToQuickSort, int low, int high) {
        if (low < high + 1) {
            int p = partition(arrayToQuickSort, low, high);
            quickSort(arrayToQuickSort, low, p - 1);
            quickSort(arrayToQuickSort, p + 1, high);
        }
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private int getPivot(int low, int high) {
        Random random = new Random();
        return random.nextInt((high - low) + 1) + low;
    }

    private int partition(int[] A, int low, int high) {
        swap(A, low, getPivot(low, high));
        int border = low + 1;
        for (int i = border; i <= high; i++) {
            if (A[i] < A[low]) {
                swap(A, i, border++);
            }
        }
        swap(A, low, border - 1);
        return border - 1;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}




