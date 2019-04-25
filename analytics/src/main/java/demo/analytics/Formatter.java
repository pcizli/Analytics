package demo.analytics;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Formatter {

    public static String toJSON(Result result) {
        throw new NotImplementedException();
    }

    public static String format(Result result) {
        throw new NotImplementedException();
    }

    public static String format(Result result, boolean prettyFormat) {
        String output = format(result);
        return prettyFormat ? pretty(output) : output;
    }

    static String pretty(String resultStr) {
        throw new NotImplementedException();
    }
}
