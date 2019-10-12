import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * SetTests
 */
public class SetTests {

    @Test
    public void setTest() {
        /**
         * tests set's output
         */
        FractionSet fset = new FractionSet();

        fset.insert(fset.root, new Fraction(3, 8));
        fset.insert(fset.root, new Fraction(15, 5));
        fset.insert(fset.root, new Fraction(2, 9));
        fset.insert(fset.root, new Fraction(-11, 14));
        fset.insert(fset.root, new Fraction(-3, 2));
        fset.insert(fset.root, new Fraction(2, 4));

        assertEquals(fset.root.value.value(), 0.375, 0);
        assertEquals(fset.maximum(fset.root).value(), 3, 0);
        assertEquals(fset.minimum(fset.root).value(), -1.5, 0);

    }
}