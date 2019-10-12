/**
 * Fraction
 */
public class Fraction {
    /**
     * fraction numenator and denominator
     */
    private int m;
    private int n;

    /**
     * empty constructor returns zero
     */
    public Fraction() {
        this.m = 0;
        this.n = 1;
    }

    /**
     * constructor for a usual fraction
     * 
     * @param m - numenator
     * @param n - denominator
     */
    public Fraction(int m, int n) {
        if (n == 0) {
            this.m = 0;
            this.n = 1;
        } else {
            if (m * n > 0 && n < 0) {
                n = 0 - n;
                m = 0 - m;
            }

            this.m = m;
            this.n = n;
            this.reduce();
        }
    }

    /**
     * constructor for an integer number
     * 
     * @param m
     */
    public Fraction(int m) {
        this.m = m;
        this.n = 1;
    }

    /**
     * setter functions
     */
    public void setM(int m) {
        this.m = m;
    }

    public void setN(int n) {
        this.n = n;
    }

    /**
     * reduces a fraction
     * 
     */
    void reduce() {
        int gcd = GCD(Math.abs(this.m), Math.abs(this.n));
        if (gcd != 1) {
            this.m = this.m / gcd;
            this.n = this.n / gcd;
        }
    }

    /**
     * finds greatest common divider
     * 
     * @param m - numenator
     * @param n - denominator
     * @return greatest common divider
     */
    int GCD(int m, int n) {
        while (m != n) {
            if (m > n) {
                int tmp = m;
                m = n;
                n = tmp;
            }
            n = n - m;
        }
        return m;
    }

    /**
     * finds a sum of two fraction
     * 
     * @param X - a second fraction
     * @return fraction - a sum of two fractions
     */
    public Fraction plus(Fraction X) {
        return new Fraction(this.m * X.n + X.m * this.n, this.n * X.n);
    }

    /**
     * outputs fraction in a proper way
     * 
     * @param none
     * @return string in a format of -4 / 13
     */
    public String view() {
        if (this.m * this.n != 0) {
            if (this.m * this.n > 0) {
                return Integer.toString(this.m) + "/" + Integer.toString(this.n);
            } else {
                return "-" + Integer.toString(Math.abs(this.m)) + "/" + Integer.toString(Math.abs(this.n));
            }
        } else {
            if (this.m == 0) {
                return "0";
            } else
                return "inf";
        }
    }

    /**
     * outputs a real value
     * 
     * @return double - a result of a dividing
     */
    public double value() {
        return (double) this.m / this.n;
    }
}