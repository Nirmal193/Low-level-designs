package org.example.designPatterns.abstractFactory.TCSClient;

public final class TCSIdCardImpl extends TCSIdCard {
    private final String department;
    private final String designation;

    public TCSIdCardImpl(int id, String name, String bloodGroup,
                         String department, String designation) {
        super(id, name, bloodGroup);
        this.department = department;
        this.designation = designation;
    }

    @Override
    public void displayDetails() {
        System.out.println("TCS ID Card Details:");
        System.out.println("ID: " + getId());
        System.out.println("Organisation Name: " + getOrganisationName());
        System.out.println("Name: " + getName());
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Blood Group: " + getBloodGroup());
        System.out.println("Valid Until: " + getValidUntil());
    }

    @Override
    public boolean validateCard() {
        if(isActive()  &&
                getName().equalsIgnoreCase("TCS") ||
                (!getClientName().isBlank()&& getClientName().equalsIgnoreCase("TCS client"))){
            System.out.println("ID Card is valid.");
            return true;
        } else {
            System.out.println("ID Card is invalid.");
            return false;
        }
    }

    public String getDepartment() { return department; }
    public String getDesignation() { return designation; }
}
