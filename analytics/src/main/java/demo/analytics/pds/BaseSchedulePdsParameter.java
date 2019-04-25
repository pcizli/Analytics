package demo.analytics.pds;

import com.pci.gtdw.util.GTTimestamp;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Parameter POJO for the PDSBaseSchedule PDS.
 */
public final class BaseSchedulePdsParameter {

    private String isoName;
    private Set<String> assetOwner;
    private Set<String> locations;
    private GTTimestamp beginDate;
    private GTTimestamp endDate;

    public BaseSchedulePdsParameter(String isoName, Collection<String> assetOwner, Collection<String> locations, GTTimestamp beginDate, GTTimestamp endDate) {
        this.isoName = isoName;
        this.assetOwner = new HashSet<>(assetOwner);
        this.locations = new HashSet<>(locations);
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
}
