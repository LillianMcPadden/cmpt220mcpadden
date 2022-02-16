import java.util.Scanner;

public class Fractions{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a numerator: ");
        System.out.println("Enter a denominator: ");
        int numerator = input.nextInt();
        int denominator = input.nextInt();

        if(numerator <= denominator){
            System.out.println(numerator + "/" + denominator + " is a proper fraction");
        }
        else if(numerator % denominator == 0){
                System.out.println(numerator + "/" + denominator + " is an improper fraction and it can be reduced to " + numerator / denominator);
        }
        else{
            System.out.println(numerator + "/" + denominator + " is an improper fraction and its a mixed fraction is " + numerator / denominator + " + " + numerator % denominator + "/" + denominator);
        }
    input.close();
    }
}