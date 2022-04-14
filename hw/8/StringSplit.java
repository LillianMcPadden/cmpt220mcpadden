import java.util.Scanner;
import java.util.ArrayList;

public class StringSplit{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String chars = input.nextLine();
    
        System.out.println("Enter delimeters: ");
        String delims = input.nextLine();

        System.out.println(split(chars, delims));

        input.close();
    }
    public static ArrayList <String> split(String s, String delims){
        ArrayList <String> l1 = new ArrayList <String>();
        ArrayList <String> l2 = new ArrayList <String>();
        ArrayList <String> l3 = new ArrayList <String>();

        for(int i = 0; i < s.length(); i++){
            l1.add(s.substring(i, i + 1));
        }

        for(int k = 0; k < delims.length(); k++){
            if(delims.substring(k, k + 1).equals(" ")){
            }
            else{
                l2.add(delims.substring(k, k + 1));
            }
        }
        for(int i = 0; i < l2.size(); i++){
            for(int j = 0; j < l1.size(); j++){
                if(l2.get(i).equals(l1.get(j))){
                    l1.set(j, " ");
                }
            }
        }
        int p = 0;
        while(p < l1.size()){
            String letter = l1.get(p) + l1.get(p + 1);
            l3.add(letter);
            p += 2;
        }
        return l3;
    }
}