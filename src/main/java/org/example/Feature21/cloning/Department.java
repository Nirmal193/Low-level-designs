package org.example.Feature21.cloning;

public record Department(String name, String location) implements Cloneable{
    public Department(String name, String location) {
        if (name == null || name.isBlank()) throw new IllegalStateException("Name must not be null or blank");
        if (location == null || location.isBlank()) throw new IllegalStateException("Location must not be null or blank");
        this.name = name;
        this.location = location;
    }
    protected  Department clone() throws CloneNotSupportedException{
        return (Department) super.clone();
    }
}
