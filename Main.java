/**
 * Hello
 */
public class Main {

    public static void main(String[] args) {
        FractionSet fset = new FractionSet();
        fset.insert(fset.root, new Fraction(3, 7));
        fset.insert(fset.root, new Fraction(15, 5));
        fset.insert(fset.root, new Fraction(2, 9));
        System.out.println(fset.maximum(fset.root).value() + fset.minimum(fset.root).value());

    }
}