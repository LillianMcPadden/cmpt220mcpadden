import java.util.Scanner;
public class Capitalize{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String w = input.nextLine();
        System.out.println("The new string is: " + title(w));
        input.close();
    }
    public static String title(String s){
        String[] arr = s.split(" ");
        StringBuffer str = new StringBuffer();
        for(int i = 0; i < arr.length; i++){
            str.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
        }
        return str.toString().trim();
    }
}