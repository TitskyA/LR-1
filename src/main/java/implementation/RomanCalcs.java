package implementation;

import operations.Calculations;
import operations.Operation;

import java.io.IOException;

public class RomanCalcs extends Calculations {

    @Override
    public Object addition(Object first, Object second) throws IOException {
        Operation execute = (first1, second1) -> first1 + second1;
        return arabicToRaman(execute.execute(romanToArabic((String) first), romanToArabic((String) second)));
    }

    @Override
    public Object subtraction(Object first, Object second) throws IOException {
        Operation execute = (first1, second1) -> first1 - second1;
        return arabicToRaman(execute.execute(romanToArabic((String) first), romanToArabic((String) second)));
    }

    @Override
    public Object multiplication(Object first, Object second) throws IOException {
        Operation execute = (first1, second1) -> first1 * second1;
        return arabicToRaman(execute.execute(romanToArabic((String) first), romanToArabic((String) second)));
    }

    @Override
    public Object division(Object first, Object second) throws IOException {
        Operation execute = (first1, second1) -> first1 / second1;
        return arabicToRaman(execute.execute(romanToArabic((String) first), romanToArabic((String) second)));
    }

    private int romanToArabic(String input) throws IOException {

        int output = switch (input) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> throw new IOException("Неверный формат входных данных");
        };
        return output;
    }

    private String arabicToRaman(int input) throws IOException {

        String c = "";
        String output = "";
        int[] cases = {100, 90, 80, 70, 60, 50, 40, 30, 20 ,10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        if (input <= 0) {throw new IOException("Неположительный результат");}

        for (int i: cases) {
            if (input >= i) {
                switch (i) {
                    case 1 -> c = "I";
                    case 2 -> c = "II";
                    case 3 -> c = "III";
                    case 4 -> c = "IV";
                    case 5 -> c = "V";
                    case 6 -> c = "VI";
                    case 7 -> c = "VII";
                    case 8 -> c = "VIII";
                    case 9 -> c = "IX";
                    case 10 -> c = "X";
                    case 20 -> c = "XX";
                    case 30 -> c = "XXX";
                    case 40 -> c = "XL";
                    case 50 -> c = "L";
                    case 60 -> c = "LX";
                    case 70 -> c = "LXX";
                    case 80 -> c = "LXXX";
                    case 90 -> c = "XC";
                    case 100 -> c = "C";
                }
                input = input - i;
                output = output + c;
            }
        }
        return output;
    }

}
