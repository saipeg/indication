package com.andrey;

import java.util.*;

public class IsFibonacci{
    public static void main(String [] args) {
        System.out.print("Введите число=");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        double T = 0;
        {

            if (x == 1)
                System.out.println("TRUE");

            else {

                int a = 1;
                int b = 1;
                int c = 0;
                while (c < x) {
                    c = a + b;
                    a = b;
                    b = c;
                }
                if (c == x)
                    T = 1;
                else
                    T = 0;
            }
            System.out.println(T);
        }
    }
}