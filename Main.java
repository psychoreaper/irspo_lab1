
/**
 * Hello
 */

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FractionSet fset1 = new FractionSet();
        fset1.insert(fset1.root, new Fraction(3, 7));
        fset1.insert(fset1.root, new Fraction(15, 5));
        fset1.insert(fset1.root, new Fraction(2, 9));
        System.out.println(
                "max+min from code: " + (fset1.maximum(fset1.root).value() + fset1.minimum(fset1.root).value()));

        FractionSet fset2 = new FractionSet();
        FileInput input = new FileInput();
        input.inp(fset2);

        fset2.sumSet();

        FileOutput output = new FileOutput();
        output.outp(fset2);
    }
}