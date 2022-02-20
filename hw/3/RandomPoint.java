public class RandomPoint{
    public static void main(String [] args){
        // JA: This will give you points outside of the circle
        double x1 = Math.random() * 10 - 5;
        double y1 = Math.random() * 10 - 5;

        double distance = Math.pow(Math.pow(x1, 2) + Math.pow(y1, 2), 0.5);
        System.out.println("The point is (" + x1 + ", " + y1 + ")");
        System.out.println("The distance to the center is " + distance);
    }
}