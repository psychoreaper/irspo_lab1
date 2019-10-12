import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FractionsTests {

    @Test
    /**
     * tests fractions
     */
    public void fractionTest() {
        // constructor tests

        int num = 5, denom = 10;
        Fraction usualFraction = new Fraction(num, denom); // a usual fraction
        Fraction integerFraction = new Fraction(num); // an integer number
        Fraction zeroFraction = new Fraction(); // blank constructor - makes a zero fraction
        Fraction infiniteFraction = new Fraction(denom, 0); // zero denominator - makes a zero fraction

        assertEquals(usualFraction.value(), (double) num / denom, 0);
        assertEquals(integerFraction.value(), num, 0);
        assertEquals(zeroFraction.value(), 0, 0);
        assertEquals(infiniteFraction.value(), 0, 0);
    }

    @Test
    /**
     * tests plus function
     */
    public void plusFractionTest() {

        int num = 5, denom = 10;
        Fraction usualFraction = new Fraction(num, denom); // 0.5
        Fraction integerFraction = new Fraction(num); // 5
        Fraction zeroFraction = new Fraction(); // 0

        assertEquals(usualFraction.plus(integerFraction).value(), 5.5, 0);
        assertEquals(integerFraction.plus(usualFraction).value(), 5.5, 0);
        assertEquals(usualFraction.plus(zeroFraction).value(), 0.5, 0);
    }
}