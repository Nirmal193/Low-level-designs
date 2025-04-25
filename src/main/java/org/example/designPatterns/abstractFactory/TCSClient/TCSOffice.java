package org.example.designPatterns.abstractFactory.TCSClient;

public interface TCSOffice {
    void checkIn(TCSIdCard card);
    void checkOut();
    void applyLeave();
}
