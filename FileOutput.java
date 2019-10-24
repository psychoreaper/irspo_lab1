import java.io.*;

public class FileOutput {
    public void outp(FractionSet fset) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.io"));
            if (fset.size == 0) {
                writer.write("fraction set is empty or input file never existed");
            } else {
                writer.write("fraction set maximum: " + fset.maximum(fset.root).value() + ", minimum: "
                        + fset.minimum(fset.root).value());
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}