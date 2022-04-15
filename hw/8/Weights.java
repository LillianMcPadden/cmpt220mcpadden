import java.util.Scanner;

public class Weights{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of objects: ");
        int num = input.nextInt();
        int [] w = new int [num];
        int [][] containers = new int [num][num];
        System.out.println("Enter the weights of the objects: ");
        for(int i = 0; i < num; i++){
            int newWeight = input.nextInt();
            for(int j = 0; j < num; j++){
                if(10 - w[j] >= newWeight){
                    w[j] = w[j] + newWeight;
                    break;
                }
                for (int row = 0; row < containers.length; row++){
                    for(int col = 0; col < containers[row].length; col++){
                       containers[row][col] = newWeight;
                    }
                }
            }
        }
        input.close();
        for(int i = 0; w.length > i; i++){
            System.out.println("Container contains " + w[i]);
        }
    }
}