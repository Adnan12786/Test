package com.company;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        x = sc.nextInt();
        System.out.println("Enter Second Number : ");
        y = sc.nextInt();
        sum = sum(x, y);
        System.out.println("The sum of two numbers x and y is: " + sum);
    }


    public static int sum(int a, int b)
    {
        int sum = a + b;
        return sum;
    }
}


