import java.util.Scanner;
public class MatrixInverse{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double [][] A = new double [2][2];
        A[0][0] = a;
        A[0][1] = b;
        A[1][0] = c;
        A[1][1] = d;
        double [][] newA = inverse(A);
        if(newA == null){
            System.out.println("No inverse matrix");
        }
        else{
            for(int i = 0; i < newA.length; i++){
                for(int j = 0; j < newA[i].length; j++){
                    System.out.print(newA[i][j] + " ");
                }
                System.out.println();
            }
        }
        input.close();
    }
    public static double[][] inverse(double[][] A){
        if((A[0][0] * A[1][1]) - (A[0][1] * A[1][0]) == 0){
            return null;
        }
        else{
            double[][] Ax = new double [2][2];
            double inverse = 1 / ((A[0][0] * A[1][1]) - (A[0][1] * A[1][0]));
            Ax[0][0] = A[1][1] * inverse;
            Ax[0][1] = -1 * A[0][1] * inverse;
            Ax[1][0] = -1 * A[1][0] * inverse;
            Ax[1][1] = A[0][0] * inverse;
            return Ax;
        }
    }
}