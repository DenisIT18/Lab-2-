package com.example.lab2;
    import java.util.Scanner;
    public class City {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputString = input.nextLine();
            input.close();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < inputString.length(); i++) {
                if ((i + 1) % 2 == 1) {
                    result.append(inputString.charAt(i));
                }
            }
            System.out.println(result.toString());
        }
    }
