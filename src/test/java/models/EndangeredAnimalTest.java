package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndangeredAnimalTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    public void EndangeredAnimalInstantiatesCorrectly_true(){
        EndangeredAnimal endangered = new EndangeredAnimal("white rhino", 1, "healthy", "young");
        assertTrue(true);
    }
    @Test
    public void getName_EndangeredAnimalInstantiatesWithName_whiteRhino(){
        EndangeredAnimal endangered = new EndangeredAnimal("white rhino",1, "healthy","young");
        assertEquals("white rhino", endangered.getName());
    }
    @Test
    public void getAge_EndangeredAnimalInstantiatesWithAge_young(){
        EndangeredAnimal endangered = new EndangeredAnimal("white rhino",1, "healthy","young");
        assertEquals("young", endangered.getAGE());
    }
    @Test
    public void getHealth_EndangeredAnimalInstantiatesWithHealth_healthy(){
        EndangeredAnimal endangered = new EndangeredAnimal("white rhino",1, "healthy","young");
        assertEquals("healthy", endangered.getHEALTH());
    }


}