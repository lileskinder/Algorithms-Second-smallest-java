package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = {12, 4, 9, 3, 1};
        System.out.println(secondSmallest(a));
    }

    public static int secondSmallest(int[] arr) {
        if(arr==null || arr.length < 2) {
            throw new IllegalArgumentException("Input array too small");
        }
        int smallest=Integer.MAX_VALUE, secondSmallest=Integer.MAX_VALUE;
        for (int i : arr) {
            if (i <= smallest) {
                secondSmallest = smallest;
                smallest = i;
            }
            if (i > smallest && i < secondSmallest)
                secondSmallest = i;
        }
        return secondSmallest;
    }

}
