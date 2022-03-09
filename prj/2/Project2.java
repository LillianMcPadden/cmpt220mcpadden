import java.util.Scanner;
public class Project2{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int [] num = new int[10]; //creates an array to store the 10 numbers
        int count = 1; // keeps count of the total remainder of all of the modules of each number
        boolean alike = false; // determines whether all remainders are alike or different
        for(int i = 0; i < 10; i++){
            System.out.println("Enter a value: ");
            int v = input.nextInt();
            num[i] = v % 42;
            if(num[i] >= 0 && num[i] < 10){ // makes sure number is positive and less than 1000
                count = count + 1;
            }
        }
        for (int i = 1; i < 10; i++){
            if(num[i] == num[i-1]){ // checks to see if the remainders within each module are alike
                alike = true;
            } 
            else{
                alike = false;
            }
        }
        if(alike == true){ // when all of the remainders equal the same number, the count is set to 1
            count = 1;
        } 
        System.out.println(count);
        input.close();
    }
}