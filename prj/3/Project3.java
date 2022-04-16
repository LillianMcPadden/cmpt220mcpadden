import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // loops 5 times for 5 houses
        for (int i = 1; i <= 5; i++) {
            // gets dimensions of each house and creates 2d array
            System.out.println("Enter the dimensions of house: ");
            int W = input.nextInt();
            int L = input.nextInt();
            char[][] House = new char[W][L];
            System.out.println("House " + i);
            String x = input.nextLine();
            // asks user to enter the layout of the house
            System.out.println("Enter house layout: ");
            for (int col = 0; col < House.length; col++) {
                x = input.nextLine();
                for (int row = 0; row < House[col].length; row++) {
                    House[col][row] = x.charAt(row);
                    char[][] newHouse = Maze(House[col][row]);
                    System.out.println(newHouse);
                }
            }

            input.close();
        }
    }

    // JA: This method should return a value or be declared void
    public static char[][] Maze(char[][] House) {
        char enter = '*';
        char mirror1 = '/';
        char mirror2 = '\\';
        char open = '.';
        char exit = '&';
        for (int col = 0; col < House.length; col++) {
            for (int row = 0; row < House[col].length; row++) {
                char[][] spot = new char[col][row];
                // check location of entrance to determine where to move first
                if (House[col][row] == enter) {
                    spot[col][row] = House[col][row];
                    if (row == 0) {
                        if (House[col][row + 1] == open) {
                            // move down
                            spot[col][row] = House[col][row + 1];
                        }
                    } else if (House[col + 1][row] == open) {
                        // move right
                        spot[col][row] = House[col + 1][row];
                    } else if (House[col - 1][row] == open) {
                        // move left
                        spot[col][row] = House[col - 1][row];
                    } else {
                        // move up
                        spot[col][row] = House[col][row - 1];
                    }
                }
                while (row != House.length - 1) {
                    if (House[col][row] == mirror1 || House[col][row] == mirror2) {
                        if (House[col][row + 1] == open) {
                            // move down
                            spot[col][row] = House[col][row + 1];
                        } else if (House[col + 1][row] == open) {
                            // move right
                            spot[col][row] = House[col + 1][row];
                        } else if (House[col - 1][row] == open) {
                            // move left
                            spot[col][row] = House[col - 1][row];
                        } else {
                            // move up
                            spot[col][row] = House[col][row - 1];
                        }
                    }
                }
                if (row == House.length - 1) {
                    House[col][row] = exit;
                }
                System.out.println(House[col][row]);
            }
        }
    }
}