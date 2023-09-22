    import java.util.Scanner;
    public class Digits {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer between 0 and 1000: ");
            int num = input.nextInt();
            input.close();
            if (num < 0 || num > 1000) {
                System.out.println("Please enter a valid integer between 0 and 1000.");
            } else {
                int sum = 0;
                while (num > 0) {
                    int digit = num % 10;
                    sum += digit;
                    num /= 10;
                }
                System.out.println("The sum of digits is: " + sum);
            }
        }
    }
