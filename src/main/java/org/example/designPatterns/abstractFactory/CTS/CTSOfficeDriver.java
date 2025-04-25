package org.example.designPatterns.abstractFactory.CTS;

import org.example.designPatterns.abstractFactory.Adapter.TCSAdapter;
import org.example.designPatterns.abstractFactory.TCSClient.TCSOffice;
import org.example.designPatterns.abstractFactory.TCSClient.TCSOfficeImpl;

public class CTSOfficeDriver {
    public static void main(String[] args) {
        CTSIdCardImpl ctsIdCard = new CTSIdCardImpl(
                1,
                "John Doe",
                "O+",
                "Software Engineer",
                "Development"
        );
        TCSOffice tcsOffice = new TCSOfficeImpl();
        TCSAdapter adapter = new TCSAdapter(tcsOffice, ctsIdCard);
        adapter.checkIn();
        adapter.checkOut();
        adapter.applyLeave();
    }
}
