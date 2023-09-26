package com.rakesh;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //                  0th  1st  2nd  3rd  4th  5th  6th  7th  8th  .  .. ...
        //Fibonacci series: 0  ,  1 ,  1 ,  2,   3,   5,   8,   13,  21, .....
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(count+ "th fibonacci number is: "+ b);
    }
}
