
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

        try {
            FractionSet fset2 = new FractionSet();
            Scanner input = new Scanner(new File("input.io"));
            String inputString;
            while (input.hasNext()) {
                inputString = input.nextLine();
                if (inputString.matches(".+/.+")) {
                    String[] nums = inputString.split("/");
                    fset2.insert(fset2.root, new Fraction(Integer.parseInt(nums[0]), Integer.parseInt(nums[1])));
                } else {
                    fset2.insert(fset2.root, new Fraction(Integer.parseInt(inputString)));
                }

            }

            System.out.println("max from file: " + fset2.maximum(fset2.root).value());

            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

    }
}