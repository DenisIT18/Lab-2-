    import java.util.Scanner;
    public class Prefix {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the first string: ");
            String x = input.nextLine();
            System.out.print("Enter the second string: ");
            String y = input.nextLine();
            input.close();
            int minLength = Math.min(x.length(), y.length());
            StringBuilder commonPrefix = new StringBuilder();
            for (int i = 0; i < minLength; i++) {
                char char1 = x.charAt(i);
                char char2 = y.charAt(i);
                if (char1 == char2) {
                    commonPrefix.append(char1);
                } else {
                    break;
                }
            }
            System.out.println("The common prefix is " + commonPrefix.toString());
        }
    }
