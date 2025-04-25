package org.example.designPatterns.abstractFactory.CTS;


public final class CTSIdCardImpl extends CTSIdCard {
    private final String department;
    private final String designation;
    private final String associateId;

    public CTSIdCardImpl(int id, String name, String bloodGroup,
                         String department, String designation) {
        super(id, name, bloodGroup);
        this.department = department;
        this.designation = designation;
        this.associateId = "CTS" + id;
    }

    @Override
    public void displayDetails() {
        System.out.println("CTS ID Card Details:");
        System.out.println("ID: " + getId());
        System.out.println("Associate ID: " + associateId);
        System.out.println("Organisation Name: " + getOrganisationName());
        System.out.println("Name: " + getName());
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Blood Group: " + getBloodGroup());
        System.out.println("Valid Until: " + getValidUntil());
    }

    @Override
    public boolean validateCard() {
        if(isActive() &&
                getName().equalsIgnoreCase("CTS") ||
                (getClientName().isBlank() && getClientName().equalsIgnoreCase("CTS client"))) {
            System.out.println("ID Card is valid.");
            return true;
        } else {
            System.out.println("ID Card is invalid.");
            return false;
        }
    }

    public String getDepartment() { return department; }
    public String getDesignation() { return designation; }
    public String getAssociateId() { return associateId; }
}