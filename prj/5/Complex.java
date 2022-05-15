public class Complex extends Number implements Cloneable, Comparable<Complex> {
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
        return (int)doubleValue();
    }

    @Override
    public long longValue() {
        return (long)doubleValue();
    }

    @Override
    public float floatValue() {
        return (float)doubleValue();
    }

    @Override
    public double doubleValue() {
        return abs();
    }
}