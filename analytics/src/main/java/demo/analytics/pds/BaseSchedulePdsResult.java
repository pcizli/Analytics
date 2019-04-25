package demo.analytics.pds;

import com.pci.gtdw.util.GTTimestamp;
import demo.analytics.Result;

/**
 * The Result POJO for PDSBaseSchedule PDS.
 */
public final class BaseSchedulePdsResult implements Result {

    private String isoName;
    private String assetOwner;
    private GTTimestamp operationDate;

    private double mw;

    public BaseSchedulePdsResult(String isoName, String assetOwner, GTTimestamp operationDate, double mw) {
        this.isoName = isoName;
        this.assetOwner = assetOwner;
        this.operationDate = operationDate;
        this.mw = mw;
    }

    public String getIsoName() {
        return isoName;
    }

    public String getAssetOwner() {
        return assetOwner;
    }

    public GTTimestamp getOperationDate() {
        return operationDate;
    }

    public double getMw() {
        return mw;
    }
}
