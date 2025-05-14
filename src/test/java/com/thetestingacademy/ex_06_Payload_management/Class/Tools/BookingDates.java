package com.thetestingacademy.ex_06_Payload_management.Class.Tools;

import java.util.LinkedHashMap;
import java.util.Map;

public class BookingDates {
    private String checkin;

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    private String checkout;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();
}
