public class RandomPoint{
    public static void main(String [] args){
        double x1 = Math.random() * 10;
        double y1 = Math.random() * 10;

        double distance = Math.pow(Math.pow(x1 - 0, 2) + Math.pow(y1 - 0, 2), 0.5);
        System.out.println("The point is (" + x1 + ", " + y1 + ")");
        System.out.println("The distance to the center is " + distance);
    }
}