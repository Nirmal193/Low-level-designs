package org.example.Feature21.cloning;

public record Employee2(
        String name,
        int age,
        Double salary,
        Department department,
        String designation
        ) implements  Cloneable{
    public Employee2{
        if(name == null || name.isBlank()) throw new RuntimeException("Name must not be null or blank");
        if(department==null) throw new RuntimeException("Department must not be null");
        if(salary == null) throw new RuntimeException("salary must not be null");
    }
    public Employee2(String name,int age){
        this(name,age,0.0,null,"");
    }
    protected Employee2 clone() throws CloneNotSupportedException{
        Employee2 cloned = (Employee2) super.clone();
        return new Employee2(
                cloned.name(),
                cloned.age()
                ,cloned.salary(),
                cloned.department.clone(),
                cloned.designation()
        );
    }
}
