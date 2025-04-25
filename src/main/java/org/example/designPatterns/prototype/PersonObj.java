package org.example.designPatterns.prototype;

public non-sealed class PersonObj implements Prototype<PersonObj>{
    private String name;
    private int age;

    public PersonObj(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonObj{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public PersonObj clone() {
        return new PersonObj(this.name, this.age);
    }
}
