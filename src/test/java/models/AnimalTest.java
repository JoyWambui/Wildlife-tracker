package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    public void AnimalInstantiatesCorrectly_true(){
        Animal animal = new Animal("lion",1);
        assertTrue(true);
    }
    @Test
    public void getName_AnimalInstantiatesWithName_true(){
        Animal animal = new Animal("lion",1);
        assertEquals("lion",animal.getName());
    }

}