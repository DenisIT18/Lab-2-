
       import java.util.Scanner;
       public class Dates {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            System.out.print("Enter today's day (0 for Sunday, 1 for Monday, etc.): ");
            int currentday = input.nextInt();
            System.out.print("Enter the number of days elapsed since today: ");
            int daysElaps = input.nextInt();
            int futureDayIndex = (currentday + daysElaps) % 7;
            System.out.println("Today is " + daysOfWeek[currentday] + " and the future day is " + daysOfWeek[futureDayIndex]);
            input.close();
        }
    }


