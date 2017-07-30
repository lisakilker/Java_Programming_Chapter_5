/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W3HW;

import java.util.Scanner;
import W3HW.Event;

/**
 *
 * @author Lisa
 */
public class EventDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String eventNum;
        int numOfGuests;
        eventNum = getEventNumber();
        numOfGuests = getGuests();

        Event eventOne = new Event();
        Event eventTwo = new Event(eventNum, numOfGuests);
        Event eventThree = new Event(eventNum, numOfGuests);

        System.out.println("EVENT TWO");
        eventTwo.setEventNumber(getEventNumber());
        eventTwo.setGuests(getGuests());
        System.out.println("EVENT THREE");
        eventThree.setEventNumber(getEventNumber());
        eventThree.setGuests(getGuests());

        displayEventDetails(eventOne);
        displayEventDetails(eventTwo);
        displayEventDetails(eventThree);
        theLargestEventIs(eventOne, eventTwo);
        theLargestEventIs(eventOne, eventThree);
        theLargestEventIs(eventTwo, eventThree);

        for (int guestCount = 0; guestCount < eventOne.getNumberOfGuests(); guestCount++) {
            System.out.println("Please come to my event!");
        }
    }

    public static String getEventNumber() {
        String num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the event number: ");
        num = input.nextLine();
        return num;
    }

    public static int getGuests() {
        int guests;

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter the amount of guests: ");
            guests = input.nextInt();
            input.nextLine();
        } while (guests < 5 || guests > 100);
        return guests;
    }

//        public static void displayMotto(){
//        System.out.println("**************************************************************");
//        System.out.println("*******Carly's makes the food that makes it a party.**********");
//        System.out.println("**************************************************************");
//    }
     
    public static void displayEventDetails(Event eventOne) {
        System.out.println();
        System.out.println("--EVENT DETAILS--");
        System.out.println("Event number is: " + eventOne.getEventNumber());
        System.out.println("Number of guests is: " + eventOne.getNumberOfGuests());
        System.out.println("Is this a large event? " + eventOne.isLargeEvent() + "." + " The price per guest is $" + eventOne.getPricePerGuest() + ". The total cost is: $" + eventOne.getPrice());
        System.out.println();
    }

    public static Event theLargestEventIs(Event eventTwo, Event eventThree) {
        Event largerEvent;

        if (eventTwo.getNumberOfGuests() > eventThree.getNumberOfGuests()) {
            largerEvent = eventTwo;
        } else {
            largerEvent = eventThree;
        }
        System.out.println();
        System.out.println("The larger event is: " + largerEvent.getEventNumber() + ".  This event has " + largerEvent.getNumberOfGuests() + " guests.");
        return largerEvent;
    }
}
