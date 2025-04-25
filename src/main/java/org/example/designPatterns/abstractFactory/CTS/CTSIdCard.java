package org.example.designPatterns.abstractFactory.CTS;


public sealed abstract class CTSIdCard permits CTSIdCardImpl {
    private int id;
    private String organisationName = "CTS";
    private String clientName;
    private String name;
    private String bloodGroup;
    private String validUntil;
    private boolean isActive;

    protected CTSIdCard(int id, String name, String bloodGroup) {
        this.id = id;
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.isActive = true;
        this.validUntil = "2025-12-31";
    }

    public abstract void displayDetails();
    public abstract boolean validateCard();

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getBloodGroup() { return bloodGroup; }
    public String getValidUntil() { return validUntil; }
    public boolean isActive() { return isActive; }
    public String getOrganisationName() { return organisationName; }
    public String getClientName() { return clientName; }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
