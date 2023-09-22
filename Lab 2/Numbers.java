   import java.util.Scanner;
    public class Numbers {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Введите любое число: : ");
            int num = input.nextInt();
            input.close();
            if (num < 0 || number > 1000) {
                System.out.println("Введите любое целое число.");
            } else {
                int res = 0;
                while (num > 0) {
                    int digit = num % 10;
                    res += digit;
                    num /= 10;
                }
                System.out.println("The sum of digits is: " + res);
            }
        }
    }
}
