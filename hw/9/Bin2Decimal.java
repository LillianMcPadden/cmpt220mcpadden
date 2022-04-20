import java.util.Scanner;
public class Bin2Decimal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binaryNum = input.nextLine();
        System.out.println(bin2Dec(binaryNum));
        input.close();
    }
    public static int bin2Dec(String binaryString) throws NumberFormatException{
        if(!isBinary(binaryString)){
            throw new NumberFormatException(binaryString + " is not a binary number.");
        }
        int power = 0;
        int num = 0;
        for(int i = binaryString.length() - 1; i >= 0; i--){
            if(binaryString.charAt(i) == '1'){
                num += Math.pow(2, power);
            }
            power++;
        }
        return num;
    }
    public static boolean isBinary(String String){
        for(char ch : String.toCharArray()){
            if (ch != '1' && ch != '0'){
                return false;
            }
        }
        return true;
    }
}