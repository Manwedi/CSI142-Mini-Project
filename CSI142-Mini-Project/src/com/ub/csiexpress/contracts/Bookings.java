package com.ub.csiexpress.contracts;

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
