package Myfraction;

public class FractionMain {

    public static void main(String[] args) {

        Fraction fract=new Fraction(10,2);
        System.out.println(fract.toString());
        Fraction fract1=new Fraction(4,5);
        System.out.println(fract1.toString());
        fract.addFraction(fract1);
        System.out.println(fract);

    }
}
