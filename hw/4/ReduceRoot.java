import java.util.Scanner;

public class ReduceRoot{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int initialNum = input.nextInt();
        int num = initialNum;
        int count = 0;
        if(num < 0){
            System.out.println("Not a positive number. Try again");
        } else if(Math.sqrt(num) % 1 == 0){
            System.out.println("sqrt(" + num + ") is " + Math.sqrt(num));
        } else if(num % 10 != 0){
            System.out.println("sqrt(" + num + ") is sqrt(" + num + ")");
        } else{
            while(num % 10 == 0){
                num = num / 10;
                count = count + 1;
            }
            count = (count - 1) * 10;
            System.out.println("sqrt(" + initialNum + ") is " + count + "*sqrt(" + num + ")");
        }
        input.close();
    }
}