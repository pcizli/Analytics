package demo.analytics.pds;

import demo.analytics.PrimitiveDataSource;
import demo.analytics.Result;
import demo.analytics.exception.InvalidParameterException;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public final class PDSBaseSchedule extends PrimitiveDataSource {

    public List<Result> query(Object parameters) throws InvalidParameterException {
        if (!(parameters instanceof PDSBaseScheduleParameter)) {
            throw new InvalidParameterException();
        }
        PDSBaseScheduleParameter params = (PDSBaseScheduleParameter) parameters;
        throw new NotImplementedException();
    }
}
