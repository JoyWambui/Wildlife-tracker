package dao;



import models.EndangeredAnimal;

import java.util.List;

public interface EndangeredAnimalDao {
    List<EndangeredAnimal> getAll();
    void add(EndangeredAnimal endangered);
    EndangeredAnimal findById(int id);
    void update(String name, int id, String health, String age);
    void deleteById(int id);
    void ClearAllEndangeredAnimals();

}
