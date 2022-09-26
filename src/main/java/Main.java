import implementation.ArabicCalcs;
import implementation.RomanCalcs;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение ");
        String input = scanner.nextLine();
        String[] symbols = new String[3];

        StringTokenizer numbersTrigger = new StringTokenizer(input, "+-*/ ");
        StringTokenizer symbolsTrigger = new StringTokenizer(input, "0123456789IVX ");
        symbols[0] = numbersTrigger.nextToken();
        symbols[1] = symbolsTrigger.nextToken();
        symbols[2] = numbersTrigger.nextToken();

        boolean isNumbersRoman = (NumberIdentifier.isRomanNumber(symbols[0]) && NumberIdentifier.isRomanNumber(symbols[2]));
        boolean isNumbersArabic = (NumberIdentifier.isArabicNumber(symbols[0]) && NumberIdentifier.isArabicNumber(symbols[2]));

        if (isNumbersArabic == isNumbersRoman) {
            throw new IOException("Неверный формат данных");
        }

        if (isNumbersArabic) {
            ArabicCalcs arabicCalcs = new ArabicCalcs();
            switch (symbols[1]) {
                case ("+") -> System.out.println(arabicCalcs.addition(symbols[0], symbols[2]));
                case ("-") -> System.out.println(arabicCalcs.subtraction(symbols[0], symbols[2]));
                case ("*") -> System.out.println(arabicCalcs.multiplication(symbols[0], symbols[2]));
                case ("/") -> System.out.println(arabicCalcs.division(symbols[0], symbols[2]));
            }
        } else {
            RomanCalcs romanCalcs = new RomanCalcs();
            switch (symbols[1]) {
                case ("+") -> System.out.println(romanCalcs.addition(symbols[0], symbols[2]));
                case ("-") -> System.out.println(romanCalcs.subtraction(symbols[0], symbols[2]));
                case ("*") -> System.out.println(romanCalcs.multiplication(symbols[0], symbols[2]));
                case ("/") -> System.out.println(romanCalcs.division(symbols[0], symbols[2]));
            }
        }
    }
}
