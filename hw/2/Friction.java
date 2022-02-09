import java.util.Scanner;

public class Friction{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the friction force in Newtons: ");
        double F = input.nextDouble();
        System.out.println("Enter the object's mass in kg: ");
        double m = input.nextDouble();
        System.out.println("Enter the object's acceleration in m/s^2: ");
        double a = input.nextDouble();
        double g = 9.8;
        double u = (F - (m * a))/ (m * g);
        System.out.println("The coefficient for friction is " + u);
        input.close();

    }
}