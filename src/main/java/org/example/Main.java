package org.example;

public class Main {
    public static void main(String[] args) {

        int[] fibonacciArray = getFibonacciArray(21);
        printFibonacciArray(fibonacciArray);
        System.out.println("The mean of array is " + mean(fibonacciArray));
        System.out.println("The median of array is " + median(fibonacciArray));
    }

    private static int[] getFibonacciArray(int n) {

        int[] values = new int[n];
        values[0] = 0;
        values[1] = 1;

        for (int i = 2; i < n; i++) {
            values[i] = values[i - 1] + values[i - 2];
        }

        return values;
    }

    private static void printFibonacciArray(int[] array) {

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static double mean(int[] arr) {
        int sum = 0;
        int length = arr.length;

        for (int j : arr) {
            sum += j;
        }

        return (double) sum/length;
    }

    public static int median(int[] arr) {

        int length = arr.length;

        if (length % 2 != 0)
        {
            return arr[length / 2];
        }
        return (int) ((arr[(length - 1) / 2] + arr[length / 2]) / 2.0);
    }
}
