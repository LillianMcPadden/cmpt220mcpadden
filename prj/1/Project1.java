import java.util.Scanner;

// JA: Comments?
public class Project1{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number and the mean of the two numbers: ");
        int S1 = input.nextInt(); // JA: Your variables should be lowercase
        int T = input.nextInt();

        int S2 = T * 2 - S1;
        System.out.println("The missing variable is " + S2);
        input.close();
    }
}