import java.util.Scanner;
public class TestQuadraticEquation{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        System.out.println("Coefficient a is " + qe.getA());
        System.out.println("Coefficient b is " + qe.getB());
        System.out.println("Coefficient c is " + qe.getC());
        if(qe.getDiscriminant() < 0){
            System.out.println("The discriminant is 0.");
        }
        else{
            System.out.println("The discriminant is " + qe.getDiscriminant());
        }
        System.out.println("Root 1 is " + qe.getRoot1());
        System.out.println("Root 2 is " + qe.getRoot2());
        
        if(qe.getDiscriminant() > 0){
            System.out.println("The equation has 2 roots");
        }
        else if(qe.getDiscriminant() == 0){
            System.out.println("The equation has 1 root");
        }
        else{
            System.out.println("the equation has no roots");
        }
        input.close();
    }
}