import java.util.Arrays;

public class Polynomial {
    private int[] coeff;

    public Polynomial(int[] pol)
    {
        setCoeff(pol);
    }

    public int[] getCoeff() {
        return coeff;
    }

    public void setCoeff(int[] coeff) {
        this.coeff = coeff;
    }

    public Polynomial add(Polynomial p) {
        int max_length = this.getCoeff().length > p.getCoeff().length ? this.getCoeff().length : p.getCoeff().length;
        int min_length = this.getCoeff().length < p.getCoeff().length ? this.getCoeff().length : p.getCoeff().length;
        int[] result = new int[max_length];
        for (int i = 0; i < result.length; i++) {
            if (i < min_length) {
                result[i] = this.getCoeff()[i] + p.getCoeff()[i];
            } else {
                result[i] = this.getCoeff().length > p.getCoeff().length ? this.getCoeff()[i] : p.getCoeff()[i];
            }
        }
        return new Polynomial(result);
    }

    @Override
    public String toString() {
        int k=coeff.length-1;
        for (int i=coeff.length -1; i >= 0; i--) {
            if (k==0) System.out.printf("%d", coeff[i]); else {
                if (coeff[i-1] < 0) {
                    System.out.printf("%d*X^%d ", coeff[i], k);
                    k--;
                } else {
                    System.out.printf("%d*X^%d + ", coeff[i], k);
                    k--;
                }
            }
        }
        return " ";
    }
}
