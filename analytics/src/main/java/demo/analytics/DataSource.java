package demo.analytics;

import demo.analytics.exception.InvalidParameterException;

import java.util.List;

/**
 * The main interface from which abstract data source class ADS and PDS implement.
 */
public interface DataSource {

    /**
     * Perform a data source query.
     *
     * @param params A POJO class
     * @return A list of object of a POJO class
     * @throws InvalidParameterException Throw when the input parameter object is not valid in some way, which can be due to 1) incorrect concrete class or 2) invalid parameter content.
     */
    List<Result> query(Object params) throws InvalidParameterException;
}
