import java.util.Scanner;

public class CircleDiameterArea{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double diameter = radius * 2;
        double area = radius * radius * Math.PI;

        System.out.println("The diameter is " + diameter);
        System.out.println("The area is " + area);
        input.close();
    }
}
