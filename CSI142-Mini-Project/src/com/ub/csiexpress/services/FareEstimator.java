package com.ub.csiexpress.services

import com.ub.csiexpress.model.CityEnum;

public class FareEstimator{
    private static final double RATE_PER_KM = 0.40;

    public int calculateFare(CityEnum from, CityEnum to){
        double distance = from.distanceTo(to);
        return calculateFare(distance);
    }

    public int calculateFare(double distanceKm){ //Return int now
        double rawFare = distanceKm * RATE_PER_KM;
        return (int) Math.round(rawFare); //Round to nearest Pula
    }
    
    public int calculateFareForTrip(CityEnum[] trip){
        double totalDistance = 0;
        for(int i = 0; i < trip.length - 1; i++){
            totalDistance += trip[i].dsitanceTo(trip[i + 1]);
        }
        return calculateFare(totalDistance);
    }
}
