import java.util.HashMap;
import java.util.Map;

public class NumberIdentifier {

    public static boolean isRomanNumber(String number) {
        String[] romanNumbers = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "IIX", "IX", "X"};

        for (String romanNumber: romanNumbers) {
            if (romanNumber.equals(number)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArabicNumber(String number) {
        String[] arabicNumbers = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        for (String arabicNumber: arabicNumbers) {
            if (arabicNumber.equals(number)) {
                return true;
            }
        }
        return false;
    }

}
