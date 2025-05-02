public class ComplexNumberOperation {
    public static void main(String[] args) {
        Complex complexNo1 = new Complex(4, 5);
        Complex complexNo2 = new Complex(9, 4);

        Complex sum = Complex.add(complexNo1, complexNo2);
        Complex diff = Complex.diff(complexNo1, complexNo2);
        Complex mul = Complex.mul(complexNo1, complexNo2);

        sum.printComplexNumber();
        diff.printComplexNumber();
        mul.printComplexNumber();
    }
}

class Complex {
    int imag;
    int real;

    public Complex(int r, int i) {
        this.real = r;
        this.imag = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.imag + b.imag);
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.imag - b.imag);
    }

    public static Complex mul(Complex a, Complex b) {
        return new Complex(((a.real * b.real) - (a.imag * b.imag)), ((a.imag * b.real) + (a.real * b.imag)));
    }

    public void printComplexNumber() {
        if (real == 0 && imag != 0) {
            System.out.println(imag + "i");
        } else if (imag == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + "+" + imag + "i");
        }
    }
}
