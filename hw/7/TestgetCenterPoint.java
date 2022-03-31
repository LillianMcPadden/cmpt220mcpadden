import java.util.Scanner;
public class TestgetCenterPoint{
    public static Point getCenterPoint(Point p1, Point p2, Point p3){
        
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        double x3 = p3.getX();
        double y3 = p3.getY();
        double centerx = ((x1 + x2 + x3) / 3);
        double centery = ((y1 + y2 + y3) / 3);
        Point p = new Point(centerx,centery);
        return p;
    }
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2, x3, y3: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        Point p3 = new Point(x3, y3);

        Point p = getCenterPoint(p1,p2,p3);
        System.out.println("The center point is at (" + p.getX() + " , " + p.getY() + ")");
        input.close();
    }   
}