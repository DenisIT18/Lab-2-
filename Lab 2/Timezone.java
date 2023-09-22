package com.example.lab2;
import java.util.TimeZone;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;
        public class Timezone {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the time zone offset to GMT: ");
            int time = input.nextInt();
            input.close();
            Calendar calendar = Calendar.getInstance();
            TimeZone timeZone = TimeZone.getTimeZone("GMT");
            timeZone.setRawOffset(time * 60 * 60 * 1000);
            calendar.setTimeZone(timeZone);
            DateFormat timeFormat = new DateFormat("HH:mm:ss");
            String currentTime = timeFormat.format(calendar.getTime());
            System.out.println("The current time is " + currentTime);
        }
    }
}
