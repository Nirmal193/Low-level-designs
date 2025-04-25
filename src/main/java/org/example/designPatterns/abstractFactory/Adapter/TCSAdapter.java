package org.example.designPatterns.abstractFactory.Adapter;

import org.example.designPatterns.abstractFactory.CTS.CTSIdCard;
import org.example.designPatterns.abstractFactory.CTS.CTSIdCardImpl;
import org.example.designPatterns.abstractFactory.TCSClient.TCSIdCard;
import org.example.designPatterns.abstractFactory.TCSClient.TCSIdCardImpl;
import org.example.designPatterns.abstractFactory.TCSClient.TCSOffice;

public class TCSAdapter {
    private TCSOffice tcsOffice;
    private CTSIdCardImpl CTSIdCard;
    public TCSAdapter(TCSOffice tcsOffice, CTSIdCardImpl CTSIdCard) {
        this.tcsOffice = tcsOffice;
        this.CTSIdCard = CTSIdCard;
    }
    public TCSIdCard convertIdCard(){
        TCSIdCard tcsIdCard = new TCSIdCardImpl(CTSIdCard.getId(),
                CTSIdCard.getName(),
                CTSIdCard.getBloodGroup(),
                CTSIdCard.getDesignation(),
                CTSIdCard.getDepartment());
        tcsIdCard.setClientName("TCS client");
        return tcsIdCard;
    }
    public void checkIn() {
        tcsOffice.checkIn(convertIdCard());
    }
    public void checkOut() {
        tcsOffice.checkOut();
    }
    public void applyLeave() {
        tcsOffice.applyLeave();
    }

}
