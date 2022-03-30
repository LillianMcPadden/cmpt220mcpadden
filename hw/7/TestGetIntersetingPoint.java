import java.util.Scanner;
public class TestGetIntersetingPoint{
    public static Point getIntersectingPoint(Point p1, Point p2, Point p3, Point p4){
        
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        double x3 = p3.getX();
        double y3 = p3.getY();
        double x4 = p4.getX();
        double y4 = p4.getY();

        double a = y1 - y2;
        double b = x1 - x2;
        double c = y3 - y4;
        double d = x3 - x4;
        double e = (a * x1) - (b * y1);
        double f = (c * x3) - (d * y3);
        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
        Point p = new Point(x,y);
        return p;
    }
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        double a = y1 - y2;
        double b = x1 - x2;
        double c = y3 - y4;
        double d = x3 - x4;
        if((a * d) - (b * c) == 0) {
            System.out.println("The two lines are parallel");
        }
        else{
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);
            Point p4 = new Point(x4, y4);

            Point p = getIntersectingPoint(p1,p2,p3,p4);
            System.out.println("The intersecting point is at (" + p.getX() + " , " + p.getY() + ")");
        }
        input.close();
    }   
}