import java.util.*;

public class PolynomialList {
    private ArrayList<Polynomial> polynomials;

    public PolynomialList(ArrayList<Polynomial> polys) {
        setPolynomials(polys);
    }

    public ArrayList<Polynomial> getPolynomials() {
        return polynomials;
    }

    public void setPolynomials(ArrayList<Polynomial> polynomials) {
        this.polynomials = polynomials;
    }

    public Polynomial sum () {
        Polynomial globalResult = new Polynomial(new int[]{0});
        Polynomial result;
        for (Polynomial pol : getPolynomials()) {
            result = globalResult.add(pol);
            globalResult = result;
        }
        return globalResult;
    }
}
