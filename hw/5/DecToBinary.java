import java.util.Scanner;
public class DecToBinary{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        System.out.println("The binary value is " + decimalToBinary(num));
        input.close();
    }
    public static String decimalToBinary(int value){
        String binNum = "";
        while (value > 0){
            binNum = value % 2 + binNum;
            value /= 2;
        }
        return binNum;
    }
}