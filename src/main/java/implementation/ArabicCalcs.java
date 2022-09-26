package implementation;

import operations.Calculations;
import operations.Operation;

public class ArabicCalcs extends Calculations {


    @Override
    public Object addition(Object first, Object second) {
        Operation execute = (first1, second1) -> first1 + second1;
        return execute.execute(Integer.parseInt((String) first), Integer.parseInt((String) second));
    }

    @Override
    public Object subtraction(Object first, Object second) {
        Operation execute = (first1, second1) -> first1 - second1;
        return execute.execute(Integer.parseInt((String) first), Integer.parseInt((String) second));
    }

    @Override
    public Object multiplication(Object first, Object second) {
        Operation execute = (first1, second1) -> first1 * second1;
        return execute.execute(Integer.parseInt((String) first), Integer.parseInt((String) second));
    }

    @Override
    public Object division(Object first, Object second) {
        Operation execute = (first1, second1) -> first1 / second1;
        return execute.execute(Integer.parseInt((String) first), Integer.parseInt((String) second));
    }
}
