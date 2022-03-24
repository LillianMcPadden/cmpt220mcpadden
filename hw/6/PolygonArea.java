import java.util.Scanner;

public class PolygonArea{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double area = 0;
        int j = 5;
        System.out.println("Enter the 6 x coordinates of a convex polygon: ");
        double [] xpoints = new double [6];
        xpoints[0] = input.nextDouble();
        xpoints[1] = input.nextDouble();
        xpoints[2] = input.nextDouble();
        xpoints[3] = input.nextDouble();
        xpoints[4] = input.nextDouble();
        xpoints[5] = input.nextDouble();
        System.out.println("Enter the 6 y coordinates of a convex polygon: ");
        double [] ypoints = new double [6];
        ypoints[0] = input.nextDouble();
        ypoints[1] = input.nextDouble();
        ypoints[2] = input.nextDouble();
        ypoints[3] = input.nextDouble();
        ypoints[4] = input.nextDouble();
        ypoints[5] = input.nextDouble();
        for(int i = 0; i < 6; i++){
            area = area + ((xpoints[j] + xpoints[i]) * (ypoints[j] - ypoints[i]));
            j = i;
        }
        System.out.println(area/2);
        input.close();
    }
}