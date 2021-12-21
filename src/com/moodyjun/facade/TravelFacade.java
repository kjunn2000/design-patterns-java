package com.moodyjun.facade;

import java.util.List;

public class TravelFacade {
    private HotelBooker hotelBooker;
    private FlightBooker flightBooker;

    public TravelFacade(HotelBooker hotelBooker, FlightBooker flightBooker) {
        this.hotelBooker = hotelBooker;
        this.flightBooker = flightBooker;
    }

    public void getHotelFlightData(){
        List<String> hotelList = hotelBooker.getHotelList();
        List<String> flightList = flightBooker.getFlightList();
//        manipulate data
    }
}
