import java.util.Scanner;

public class Years{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int mins = input.nextInt();
        int year = mins / 525600;
        int remainingMins = mins % 525600;
        int days = remainingMins / 1440;
        System.out.println(mins + " minutes is aproximately " + year + " years and " + days + " days");
        input.close();
    }
}