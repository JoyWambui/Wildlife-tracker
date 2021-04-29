package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SightingTest {

    @Test
    public void SightingInstantiatesCorrectly_true(){
        Sighting sighting = new Sighting("Zone A","Sandra",1);
        assertTrue(true);
    }
    @Test
    public void getLocation_SightingInstantiatesWithLocation_zoneA(){
        Sighting sighting = new Sighting("Zone A","Sandra",1);
        assertEquals("Zone A", sighting.getLocation());
    }
    @Test
    public void getRanger_SightingInstantiatesWithRanger_sandra(){
        Sighting sighting = new Sighting("Zone A","Sandra",1);
        assertEquals("Sandra", sighting.getRanger());
    }




}