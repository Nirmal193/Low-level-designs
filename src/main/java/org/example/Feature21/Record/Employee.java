package org.example.Feature21.Record;

public record Employee(int id, String name, String department,
                       String designation, double salary) {
    public Employee(int id, String name, String department,
                    String designation, double salary) {
        if(id<=0) throw new IllegalStateException("Id must be greater than 0");
        if(name==null || name.isBlank()) throw new IllegalStateException("Name must not be null or blank");
        if(department==null || department.isBlank()) throw new IllegalStateException("Department must not be null or blank");
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }
}
