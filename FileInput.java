import java.util.Scanner;
import java.io.*;

public class FileInput {

    public void inp(FractionSet fset) {
        try {
            Scanner input = new Scanner(new File("input.io"));
            String inputString;
            while (input.hasNext()) {
                inputString = input.nextLine();
                if (inputString.matches(".+/.+")) {
                    String[] nums = inputString.split("/");
                    fset.insert(fset.root, new Fraction(Integer.parseInt(nums[0]), Integer.parseInt(nums[1])));
                } else if (inputString.matches("[0-9]") || inputString.matches("-[0-9]")) {
                    fset.insert(fset.root, new Fraction(Integer.parseInt(inputString)));
                }

            }

            System.out.println("max from file: " + fset.maximum(fset.root).value());

            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
}