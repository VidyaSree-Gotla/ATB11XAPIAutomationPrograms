package com.thetestingacademy.ex_06_Payload_management.Class.Manual.Response_Payload;

import com.thetestingacademy.ex_06_Payload_management.Class.Manual.Request_Payload.Booking;

public class Booking_Response {
    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    private Integer bookingid;
    private Booking booking;
}
