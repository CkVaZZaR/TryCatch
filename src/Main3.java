import java.io.*;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        File file = new File("input.txt");
        File output = new File("output.txt");

        try {
            int count = 0;
            int count1 = 0;
            int tmp;
            Scanner in = new Scanner(file);
            PrintWriter writer = new PrintWriter(output);
            while(in.hasNextInt()) {
                System.out.println(in.nextInt());
                ++count;
            }
            in.close();
            in = new Scanner(file);
            while(in.hasNextInt()) {
                tmp = in.nextInt();
                System.out.println(tmp);
                if (count / 2 <= count1++) {
                    writer.print(tmp + " ");
                }
            }
            count1 = 0;
            in.close();
            in = new Scanner(file);
            while(in.hasNextInt()) {
                tmp = in.nextInt();
                if (count / 2 > count1++) {
                    writer.print(tmp + " ");
                }
            }
            writer.close();
            in.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}