package com.thetestingacademy.ex_06_Payload_management.Class.Manual.Request_Payload;

public class Booking {
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public Boolean getDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(Boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public Booking_Dates getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(Booking_Dates bookingdates) {
        this.bookingdates = bookingdates;
    }

    private String firstname;
    private String lastname;
    private Integer totalprice;
    private Boolean depositpaid;
    private String additionalneeds;
    private Booking_Dates bookingdates;
}
