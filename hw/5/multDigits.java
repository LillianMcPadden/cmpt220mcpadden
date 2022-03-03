import java.util.Scanner;
public class multDigits{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three digit number: ");
        int num = input.nextInt();
        int x = multiplyDigits(num);
        System.out.println(x);
        input.close();
    }
    public static int multiplyDigits(long n){
        long i = 0;
        int ans = 1;
        while(i < n){
            int num = (int) (n % 10);
            ans = ans * num;
            n = (int) (n / 10);
        }
        return ans;
    }
}