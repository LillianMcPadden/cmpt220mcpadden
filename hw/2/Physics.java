import java.util.Scanner;

public class Physics{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ball travel time in seconds: ");
        double t = input.nextDouble();
        double a = 9.8;
        double v0 = 0;
        double d = v0 * t + a * (t * t)/2;
        System.out.println("The height of the building is " + d + "meters");
        input.close();
    }
}