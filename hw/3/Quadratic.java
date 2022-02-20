import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if (discriminant == 0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("The equation has one root " + r1);
        }
        if (discriminant < 0) {
            System.out.println("The equation has no real roots");
        }
        input.close();
    }
}