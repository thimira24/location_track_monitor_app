package me.thimira.monitor;

import androidx.collection.ArraySet;

import com.google.android.gms.maps.model.Marker;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import me.thimira.monitor.Model.DriverGeoModel;
import me.thimira.monitor.Model.RiderModel;

public class Common {
    public static final String RIDER_INFO_REFERENCE = "Riders";
    public static final String DRIVERS_LOCATION_REFERENCES = "DriversLocation";
    public static final String DRIVERS_INFO_REFERENCE = "DriverInfo";
    public static RiderModel currentRider;
    public static Set<DriverGeoModel> driversFound = new HashSet<DriverGeoModel>();
    public static HashMap<String, Marker> msrkerList = new HashMap<>();

    public static String builderWelcomeMessage() {
        if (Common.currentRider != null) {
            return new StringBuilder("Welcome, ")
                    .append(Common.currentRider.getFirstName())
                    .append(" ")
                    .append(Common.currentRider.getLastName()).toString();

        } else
            return " ";
    }

    public static String buildName(String firstName, String lastName) {
        return new StringBuilder(firstName).append(" - ").append(lastName).toString();
    }
}
