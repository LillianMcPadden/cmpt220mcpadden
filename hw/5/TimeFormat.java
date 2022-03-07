import java.util.Scanner;

public class TimeFormat{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total seconds: ");
        long secs = input.nextLong();
        System.out.println("The hours, minutes, and seconds for total seconds " + secs + " is " + format(secs));
        input.close();
    }

    // JA: It's a clock. The maximum hours should be 24
    public static String format(long seconds){
         long sec = seconds % 60;
         seconds /= 60;
         long mins = seconds % 60;
         seconds /= 60;
         return String.format("%02d", seconds) + ":" + String.format("%02d", mins) + ":" + String.format("%02d", sec);
    }
}