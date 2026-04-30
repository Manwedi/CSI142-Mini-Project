/**
 * Laone kepaletswe 202504466
 *Lebang Taukobong 202501799
 *Legofi Faith Ledimo 202504323
 *Kgosi Temogo Totanang 202504279
 *Claude Manwedi 202101524
 */
package com.ub.csiexpress.util;

public class inputValidator{
    public static boolean isValidPlateNumber(String plateNumber){
        if(plateNumber == null || plateNumber.trim().isEmpty()){
            return false;
        }
        return plateNumber.trim().length() >= 3;
    }
    public static boolean isValidCapacity(int capacity){
        return capacity > 0;
    }
    public static boolean isValidDistance(double distance){
        return distance >0;
    }
    public static boolean isValidPassengers(int passengers){
        return passengers >0;
    }
}
