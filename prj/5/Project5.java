import java.util.Scanner;

class Project5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first complex number: ");
        Complex c1 = new Complex(input.nextDouble(), input.nextDouble());
        System.out.println("Enter the second complex number: ");
        Complex c2 = new Complex(input.nextDouble(), input.nextDouble());
        double a = c1.getRealPart();
        double b = c1.getImaginaryPart();
        double c = c2.getRealPart();
        double d = c2.getImaginaryPart();
        // addition
        System.out.printf("\n(%.1f + %.1fi) + (%.1f + %.1fi) = %s", a, b, c, d, c1.add(c2));

        // subtraction
        System.out.printf("\n(%.1f + %.1fi) - (%.1f + %.1fi) = %s", a, b, c, d, c1.subtract(c2));

        // multiplication
        System.out.printf("\n(%.1f + %.1fi) * (%.1f + %.1fi) = %s", a, b, c, d, c1.multiply(c2));

        // division
        System.out.printf("\n(%.1f + %.1fi) / (%.1f + %.1fi) = %s", a, b, c, d, c1.divide(c2));

        // absolute value
        System.out.printf("\n|%.1f + %.1fi| = %f", a, b, c1.abs());
        input.close();
    }
}
