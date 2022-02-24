import java.util.Scanner;

public class Coordinates{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of sides: ");
        int sides = input.nextInt();
        System.out.println("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();
        System.out.println("The coordinates for the polygon are: ");
        for(int i = 0; i < sides; i++){
            double x = radius * Math.cos(2 * Math.PI / sides * i);
            double y = radius * Math.sin(2 * Math.PI / sides * i);
            System.out.print("(");
            System.out.printf("%.1f", x);
            System.out.print(", ");
            System.out.printf("%.1f", y);
            System.out.print(")");
            System.out.println();
        }
        input.close();
    }
}