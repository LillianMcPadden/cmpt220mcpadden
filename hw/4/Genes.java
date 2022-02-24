import java.util.Scanner;

public class Genes{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a genome string: ");
        String genome = input.nextLine();
        boolean found = false;
        int startPoint = -1;
        for(int i = 0; i < genome.length() - 2; i++){
            String triplet = genome.substring(i,i + 3);
            if(triplet.equals("ATG")){
                startPoint = i + 3;
            } else if(((triplet.equals("TAG")) || (triplet.equals("TAA")) || (triplet.equals("TGA"))) && (startPoint != -1)){
                String gene = genome.substring(startPoint, i);
                if(gene.length() % 3 == 0){
                    found = true;
                    System.out.println(gene);
                    startPoint = -1;
                }
            }
        }
        if(!found){
            System.out.println("no genes found");
        }
        input.close();
    }
}