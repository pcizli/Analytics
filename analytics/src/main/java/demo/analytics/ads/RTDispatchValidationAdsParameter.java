package demo.analytics.ads;

import com.pci.gtdw.util.GTTimestamp;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Set;

/**
 * Parameter for RTDispatchValidation ADS.
 */
public class RTDispatchValidationAdsParameter {

    private String isoName;
    private Set<String> assetOwner;
    private Set<String> locations;
    private GTTimestamp beginDate;
    private GTTimestamp endDate;

    public RTDispatchValidationAdsParameter(String isoName, Set<String> assetOwner, Set<String> locations, GTTimestamp beginDate, GTTimestamp endDate) {
        this.isoName = isoName;
        this.assetOwner = assetOwner;
        this.locations = locations;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    public String getIsoName() {
        return isoName;
    }

    public void setIsoName(String isoName) {
        this.isoName = isoName;
    }

    public Set<String> getAssetOwner() {
        return assetOwner;
    }

    public void setAssetOwner(Set<String> assetOwner) {
        this.assetOwner = assetOwner;
    }

    public Set<String> getLocations() {
        return locations;
    }

    public void setLocations(Set<String> locations) {
        this.locations = locations;
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
