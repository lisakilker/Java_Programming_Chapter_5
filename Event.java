/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3HW;

import W3HW.EventDemo;
import java.util.Scanner;

/**
 *
 * @author Lisa
 */
class Event {

    public static double PRICE_PER_GUEST_LOW = 32.00;
    public static double PRICE_PER_GUEST_HIGH = 35.00;
    public static int CUT_OFF_AMOUNT = 50;
    private String eventNumber;
    boolean isLarge = false;
    private int guests;
    private double price;
    private double pricePerGuest;

    public Event() {
        this("A000", 0);
    }

    public Event(String eventNum, int guestAmount) {
        eventNumber = eventNum;
        guests = guestAmount;
    }

    public void setEventNumber(String eventNum) {
        eventNumber = eventNum;
    }

    public void setGuests(int guestAmount) {
        guests = guestAmount;
        if (isLargeEvent()) {
            pricePerGuest = PRICE_PER_GUEST_LOW;
        } else {
            pricePerGuest = PRICE_PER_GUEST_HIGH;
        }
        price = guests * pricePerGuest;
    }

    public String getEventNumber() {
        return eventNumber;
    }

    public int getNumberOfGuests() {
        return guests;
    }

    public Boolean isLargeEvent() {
        if (guests >= CUT_OFF_AMOUNT) {
            isLarge = true;
        } else {
        }
        return isLarge;
    }

    public double getPricePerGuest() {
        return pricePerGuest;
    }

    public double getPrice() {
        return price;
    }
}
