public class BinaryConvert{
    public static void main(String[] args){
        int num = 5;
        System.out.println("The binary number is: " + ((num / 4) + "" + ((num % 4)/2) + "" + (num % 4 % 2)));
    }
}