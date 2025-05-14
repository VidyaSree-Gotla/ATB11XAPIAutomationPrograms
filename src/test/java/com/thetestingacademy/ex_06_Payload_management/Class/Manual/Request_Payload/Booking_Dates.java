package com.thetestingacademy.ex_06_Payload_management.Class.Manual.Request_Payload;

public class Booking_Dates {
    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    private String checkin;

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    private String checkout;
}
