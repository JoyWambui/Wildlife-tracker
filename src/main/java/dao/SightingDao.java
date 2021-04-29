package dao;

import models.Animal;
import models.Sighting;

import java.util.List;

public interface SightingDao {
    List<Sighting> getAll();
    void add(Sighting sighting);
    Sighting findById(int id);
    void update(String location,String ranger, int id);
    void deleteById(int id);
    void ClearAllSightings();

}
