import java.util.Locale;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {

    public static boolean withVowels(String string) {
        String vowels = "aoueiy";
        string = string.toLowerCase(Locale.ROOT);
        for (int i = 0; i != vowels.length(); ++i) {
            if (string.contains(valueOf(vowels.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws NoVowelsExeption {
        Scanner in = new Scanner(System.in);
        String string = in.next();
        if (!withVowels(string)) {
            throw new NoVowelsExeption("No Volwes");
        }
    }
}