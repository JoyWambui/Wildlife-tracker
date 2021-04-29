package dao;

import models.Animal;

import java.util.List;

public interface AnimalDao {
    List<Animal> getAll();
    void add(Animal animal);
    Animal findById(int id);
    void update(String name, int id);
    void deleteById(int id);
    void ClearAllAnimals();
}
