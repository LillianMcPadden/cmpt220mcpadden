import java.util.Scanner;
public class OutofBoundsException {
    public static void main(String[] args) {
        int [] array = new int[100];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an index of the array(number only): ");
        int index = input.nextInt();
        try{
            System.out.println(array[index]);
        }
        catch (ArrayIndexOutOfBoundsException exVar1){
            System.out.println("Out of bounds");
        }
        input.close();
    }
}
