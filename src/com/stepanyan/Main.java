package com.stepanyan;

import java.util.Scanner;

public class Main {

/*
    Число Фибоначчи
    Написать метод, который возвращает N-ное число Фибоначчи, по правилу:
    F(0) = 0, F(1) = 1
    F(N) = F(N - 1) + F(N - 2)
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(returnTheNumber(num));
    }

    private static int returnTheNumber(int n) {
        int n0 = 1;
        int n1 = 1;
        int fibNum = 0;
        if (n == 0) {
            return fibNum;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            for(int i = 3; i <= n; i++){
                fibNum = n0 + n1;
                n0 = n1;
                n1 = fibNum;
            }
        }
        return fibNum;
    }

}
