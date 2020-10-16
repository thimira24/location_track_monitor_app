package me.thimira.monitor;

import me.thimira.monitor.Model.RiderModel;

public class Common {
    public static final String RIDER_INFO_REFERENCE ="Riders" ;
    public static final String DRIVERS_LOCATION_REFERENCES = "RiderLocation";
    public static RiderModel currentRider;

    public static String builderWelcomeMessage() {
        if (Common.currentRider != null)
        {
            return new StringBuilder("Welcome, ")
                    .append(Common.currentRider.getFirstName())
                    .append(" ")
                    .append(Common.currentRider.getLastName()).toString();

        }else
            return " ";
    }
}
