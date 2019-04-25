package demo.analytics.pds;

import demo.analytics.PrimitiveDataSource;
import demo.analytics.Result;
import demo.analytics.exception.InvalidParameterException;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

/**
 * An example concrete PDS class.
 */
public final class BaseSchedulePDS extends PrimitiveDataSource {

    public List<Result> query(Object parameters) throws InvalidParameterException {
        if (!(parameters instanceof BaseSchedulePdsParameter)) {
            throw new InvalidParameterException();
        }
        BaseSchedulePdsParameter params = (BaseSchedulePdsParameter) parameters;
        throw new NotImplementedException();
    }
}
