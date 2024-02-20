import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        File file = new File("./");
        File output = new File("result.txt");
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".txt") && !(name.equals("result.txt"))) {
                    return true;
                }
                return false;
            }
        });
        System.out.println(Arrays.toString(list));
    }
}
