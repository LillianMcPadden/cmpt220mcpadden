import java.util.Scanner;

public class Occurences{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = input.nextLine();
        int [] num = count(s);
        for(int i = 0; i < num.length; i++){
            if(num[i] > 0){
                System.out.println("Digit " + i + " occurs " + num[i] + " times.");
            }
        }
        input.close();
    }
    public static int [] count(String s){
        int[] array = new int[10];
        for (int i = 0; i < 10; i++){
            array[i] = 0;
        }
        for(int j = 0; j < s.length(); j++){
            if(Character.isDigit(s.charAt(j))){
                int num = Character.getNumericValue(s.charAt(j));
                array[num]++;
            }
        }
        return array;
    }
}