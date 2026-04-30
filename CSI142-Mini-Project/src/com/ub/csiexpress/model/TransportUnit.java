/**
 * MANWEDI CLAUDE 202101524
 */

package com.ub.csiexpress.model;

public abstract class TransportUnit {
    protected String unitID;
    protected int capacity;

    public TransportUnit(String unitID, int capacity) {
        this.unitID = unitID;
        this.capacity = capacity;

    }

    public String getUnitID() {
        return unitID;
    }

    public int getCapacity() {
        return capacity;
    }

    public String toString() {
        return "Unit: [" + unitID + "] has a capacity of" + "[" + capacity + "]";
    }
}