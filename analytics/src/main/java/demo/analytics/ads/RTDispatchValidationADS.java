package demo.analytics.ads;

import com.pci.gtdw.util.GTTimestamp;
import demo.analytics.AggregateDataSource;
import demo.analytics.Result;
import demo.analytics.exception.InvalidParameterException;
import demo.analytics.pds.BaseSchedulePDS;
import demo.analytics.pds.BaseSchedulePdsParameter;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RTDispatchValidationADS extends AggregateDataSource {

    private BaseSchedulePDS baseSchedulePDS = null;

    static List<Result> queryPDSBaseSchedule(BaseSchedulePDS baseSchedulePDS, BaseSchedulePdsParameter params) throws InvalidParameterException {
        if (baseSchedulePDS == null) {
            return Collections.emptyList();
        }
        return baseSchedulePDS.query(params);
    }

    static BaseSchedulePdsParameter createPDSBaseScheduleParameter(RTDispatchValidationAdsParameter params) {
        return createPDSBaseScheduleParameter(params.getIsoName(), params.getAssetOwner(), params.getLocations(), params.getBeginDate(), params.getEndDate());
    }

    static BaseSchedulePdsParameter createPDSBaseScheduleParameter(String isoName, Collection<String> assetOwners, Collection<String> locations, GTTimestamp beginDate, GTTimestamp endDate) {
        return new BaseSchedulePdsParameter(isoName, assetOwners, locations, beginDate, endDate);
    }

    static RTDispatchValidationAdsResult validateRTDispatch(Result... result) {
        throw new NotImplementedException();
    }

    public List<Result> query(Object parameters) throws InvalidParameterException {
        if (!(parameters instanceof RTDispatchValidationAdsParameter)) {
            throw new InvalidParameterException();
        }
        RTDispatchValidationAdsParameter params = (RTDispatchValidationAdsParameter) parameters;

        if (baseSchedulePDS == null) {
            baseSchedulePDS = new BaseSchedulePDS();
        }

        List<Result> ret = new LinkedList<>();
        List<Result> pdsBaseScheduleResult = queryPDSBaseSchedule(baseSchedulePDS, createPDSBaseScheduleParameter(params));

        for (Result result : pdsBaseScheduleResult) {
            ret.add(validateRTDispatch(result));
        }

        // throw new NotImplementedException();
        return ret;
    }
}
