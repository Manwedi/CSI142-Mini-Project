/**
 * MANWEDI CLAUDE 202101524
 */

package com.ub.csiexpress.model;

public class Route {
  private String destination;
  private double distanceKm;
  private double basePrice;
  private int passengers;

  public Route(String destination, double distanceKm, double basePrice, int passengers) {
      this.destination = destination;
      this.distanceKm = distanceKm;
      this.basePrice = basePrice;
      this.passengers = passengers;
    }
  public String getDestination(){return destination;}
  public double getDistanceKm(){return distanceKm;}
  public double getBasePrince(){return basePrice;}
  public int getPassengers(){return passengers;}
  @Override
  public String toString() {
    return destination + " (" + distanceKm + "km) - P" + basePrice;
  }
}
