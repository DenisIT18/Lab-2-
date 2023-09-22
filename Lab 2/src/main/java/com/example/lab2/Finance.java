package com.example.lab2;
import java.util.Scanner;
public class Finance{
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите промежуточную сумму и ставку чаевых (в процентах).: ");
            double x = input.nextDouble();
            double y = input.nextDouble();
            double z = (x * y) / 100.0;
            double total = x + y;
            System.out.println("The gratuity is $" + y + " and total is $" + total);
            input.close();
        }
    }
