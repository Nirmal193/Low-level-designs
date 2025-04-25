package org.example.designPatterns.abstractFactory.TCSClient;

public class TCSOfficeImpl implements TCSOffice{
    public void checkIn(TCSIdCard card) {
        if (card.validateCard()) {
            System.out.println("Welcome " + card.getName() + " to TCS office.");
        } else {
            System.out.println("Invalid ID Card. Access Denied.");
        }
        System.out.println("Checking in TCS office");
    }
    public void checkOut() {
        System.out.println("Checking out TCS office");
    }
    public void applyLeave() {
        System.out.println("Applying leave in TCS office");
    }
}
