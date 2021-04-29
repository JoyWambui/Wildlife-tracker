package models;

import java.util.Objects;

public class Animal {
    protected String name;
    protected int id;

    public Animal(String name, int id){
    this.name=name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getId() == animal.getId() && getName().equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
