package demo.analytics.pds;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * A simple POJO.
 */
public final class PDSBaseScheduleParameter {

    private GTTimestamp beginDate;
    private GTTimestamp endDate;

    public PDSBaseScheduleParameter(GTTimestamp beginDate, GTTimestamp endDate) {
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public GTTimestamp getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(GTTimestamp beginDate) {
        this.beginDate = beginDate;
    }

    public GTTimestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(GTTimestamp endDate) {
        this.endDate = endDate;
    }

    public String toString() {
        throw new NotImplementedException();
    }
}
