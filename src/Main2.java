import java.io.*;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        File file = new File("input.txt");
        File output = new File("output.txt");
//        try {
//            FileInputStream fis = new FileInputStream(file);
//            int c;
//            while ((c = fis.read()) != -1) {
//                System.out.print(c + " ");
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            Scanner in = new Scanner(file);
            PrintWriter writer = new PrintWriter(output);
            while(in.hasNextInt()) {
                writer.print(in.nextInt() + "/");
            }
            writer.close();
            in.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
