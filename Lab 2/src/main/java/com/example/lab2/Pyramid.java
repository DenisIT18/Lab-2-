package com.example.lab2;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        do {
            System.out.print("Enter an integer from 1 to 15: ");
            x = input.nextInt();
        } while (x < 1 || x > 15);
        input.close();
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print("   ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.printf("%2d ", j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.printf("%2d ", j);
            }
            System.out.println();
        }
    }
}
