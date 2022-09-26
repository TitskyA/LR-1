package operations;

import java.io.IOException;

public abstract class Calculations {

    public abstract Object addition(Object first, Object second) throws IOException;
    public abstract Object subtraction(Object first, Object second) throws IOException;
    public abstract Object multiplication (Object first, Object second) throws IOException;
    public abstract Object division (Object first, Object second) throws IOException;
}
