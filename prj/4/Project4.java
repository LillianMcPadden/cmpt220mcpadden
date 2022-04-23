import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Project4{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = input.nextInt();
        System.out.println("Enter the gender: ");
        String gender = input.nextLine();
        System.out.println("Enter the name: ");
        String name = input.nextLine();
        input.close();
// creates the arraylist of baby names from file according to 
// what the user inputs via load names method
        ArrayList <BabyName> names = loadNames("babynameranking" + year +".txt");
        BabyName babyName = findName(name, year, names);

        if (babyName != null){
            System.out.println(babyName.getName() + " is ranked #" + babyName.getRank()+ " in year " + babyName.getYear());
        }
        else{
            System.out.println("The name " + name + " is not ranked in year " + year);
        }
    }
    private static ArrayList<BabyName> loadNames(String fileName) throws IOException{
        ArrayList <BabyName> info = new ArrayList<BabyName>();
        File file = new File(fileName);
        if(!file.exists()){
            throw new IOException("File " + fileName + " does not exist.");
        }
        int year = Integer.parseInt(fileName.substring(15,19));

        try(Scanner read = new Scanner(file);){
            while(read.hasNextLine()){
                int rank = Integer.parseInt(read.next());

                String maleName = read.next();
                String femaleName = read.next();

                info.add(new BabyName(rank, maleName, "M", year));
                info.add(new BabyName(rank, femaleName, "F", year));
            }
        }
        return info;
    }
    private static BabyName findName(String name, int year, ArrayList<BabyName> names){
        for(BabyName babyName : names){
            if(babyName.getName().equals(name)){
                return babyName;
            }
        }
        return null;
    }
}
class BabyName{
    private int rank;
    private String name;
    private String gender;
    private int year;
// this class creates all of the baby names as they are arranged on the txt files
    public BabyName(){
        rank = 0;
        name = "";
        gender = "";
        year = 0;
    }
    public BabyName(int rank, String name, String gender, int year){
        setBabyName(rank, name, gender, year);
    }
    public String toString(){
        return (this.rank + ", " + this.name + ", " + this.gender + ", " + this.year);
    }
    public void setBabyName(int rank, String name, String gender, int year){
        this.rank = rank;
        this.name = name;
        this.gender = gender;
        this.year = year;
    }
    public int getRank(){
        return rank;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getYear(){
        return year;
    }
}