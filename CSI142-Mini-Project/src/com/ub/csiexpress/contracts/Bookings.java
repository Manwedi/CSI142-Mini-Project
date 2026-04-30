/**
* Lebang Taukobong 202501799
* Legofi Faith Ledimo 202404323
* Kgosi Temogo Totanang 202504279
* Laone Kepaletswe 202504466
* Claude Manwedi 202101524
**/
package com.ub.csiexpress.contracts;

import com.ub.csiexpress.model.CityEnum;

public class Bookings {
    private static int idCounter = 1;
    private String name;
    private CityEnum from;
    private CityEnum to;
    private String busName;
    private int fare;

    public Bookings(String name, CityEnum from, CityEnum to,String busName, int fare) {
        this.bookingsid = idCounter++;
        this.name = name;
        this.from = from;
        this.to = to;
        this.busName = busName;
        this.fare = fare;
    }
    public int getBookingId() {
        return bookingId;
    }

    public String getName() {
        return name;
    }
    public CityEnum getFrom() {
        return from;
    }
    public CityEnum getTo() {
        return to;
    }
    public int getFare() {
        return fare;
    }

    @Override
    public String toString() {
        return String.format(format:"ID: %D | %s: %s -> %s | Bus: %s",
        bookingId,name,from,to,busName,fare);
            
    }

}
