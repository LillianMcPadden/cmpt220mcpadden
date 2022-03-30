public class QuadraticEquation{
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getDiscriminant(){
        double discrim = Math.pow(this.b,2) - (4 * this.a * this.c);
        return discrim;
    }
    public double getRoot1(){
        double r1 = ((-1 * this.b) + Math.sqrt(Math.pow(this.b,2) - (4 * this.a * this.c)) )/ (2 * a);
        return r1;
    }
    public double getRoot2(){
        double r2 = ((-1 * this.b) - Math.sqrt(Math.pow(this.b,2) - (4 * this.a * this.c)) )/ (2 * a);
        return r2;
    }

}