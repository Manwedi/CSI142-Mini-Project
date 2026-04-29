/**
 * MANWEDI CLAUDE 202101524
 */

package com.ub.csiexpress.model;

public class Bus extends TransportUnit {
    private String plateNumber;
    private String driverName;
    private String status;

    public Bus(String unitID, int capacity, String plateNumber, String driverName, String status) {
        super(unitID, capacity);
        this.plateNumber = plateNumber;
        this.driverName = driverName;
        this.status = status;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bus [" + plateNumber + ", Capacity: " + capacity + ", Driver: " + driverName + ", Status: " + status
                + "]";
    }
}