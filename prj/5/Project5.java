import java.util.Scanner;

class Project5 extends Complex {

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

class Complex extends Number implements Cloneable, Comparable<Complex> {
    double res = 0;
    double imag = 0;

    Complex(double res, double imag) {
        this.res = res;
        this.imag = imag;
    }

    Complex(double res) {
        this.res = res;
        this.imag = 0;
    }

    Complex() {
        this.res = 0;
        this.imag = 0;
    }
// gets real and imaginary parts
    public double getRealPart() {
        return res;
    }

    public double getImaginaryPart() {
        return imag;
    }
// add subtract multiply divide and absolute value methods
    public Complex add(Complex n1) {
        return new Complex(res + n1.res, imag + n1.imag);
    }

    public Complex subtract(Complex n1) {
        return new Complex(res - n1.res, imag - n1.imag);
    }

    public Complex multiply(Complex n1) {
        return new Complex(res * n1.res - imag * n1.imag, imag * n1.res + res * n1.imag);
    }

    public Complex divide(Complex n1) {
        return new Complex((res * n1.res + imag * n1.imag) / (Math.pow(n1.res, 2) + Math.pow(n1.imag, 2)),
                (imag * n1.res - res * n1.imag) / (Math.pow(n1.res, 2) + Math.pow(n1.imag, 2)));
    }

    public double abs() {
        return Math.sqrt(Math.pow(res, 2) + Math.pow(imag, 2));
    }
// toString, compareto, clone, and types of numeric value overrides
    @Override
    public String toString() {
        return imag == 0 ? res + "" : res + " + " + imag + "i";
    }

    @Override // Implement the compareTo method defined in Comparable
    public int compareTo(Complex o) {
        if (this.getRealPart() + this.getImaginaryPart() == o.getRealPart() + o.getImaginaryPart())
            return 0;
        else if (this.getRealPart() + this.getImaginaryPart() > o.getRealPart() + o.getImaginaryPart())
            return 1;
        else
            return -1;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Complex) super.clone();
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}