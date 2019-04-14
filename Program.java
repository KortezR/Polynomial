import java.util.*;

public class Program {
    public static void main(String[] args) {
        PolynomialList polynomials = new PolynomialList(new ArrayList<Polynomial>(Arrays.asList(
                new Polynomial(new int[] {1, 2, 3}),
                new Polynomial(new int[] {3, 4, -8, 3}),
                new Polynomial(new int[] {2, 3, 4, 1, 2})
        )));
        System.out.println(polynomials.sum());
    }
}
