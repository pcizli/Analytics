package demo.analytics;

import demo.analytics.exception.InvalidParameterException;

import java.util.List;

public interface DataSource {

    List<Result> query(Object params) throws InvalidParameterException;
}
