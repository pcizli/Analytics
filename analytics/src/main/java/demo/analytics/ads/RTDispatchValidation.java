package demo.analytics.ads;

import demo.analytics.AggregateDataSource;
import demo.analytics.Result;
import demo.analytics.exception.InvalidParameterException;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class RTDispatchValidation extends AggregateDataSource {

    public List<Result> query(Object parameters) throws InvalidParameterException {
        if (!(parameters instanceof RTDispatchValidationParameter)) {
            throw new InvalidParameterException();
        }
        RTDispatchValidationParameter params = (RTDispatchValidationParameter) parameters;
        throw new NotImplementedException();
    }
}
