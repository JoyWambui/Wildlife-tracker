package models;

public class EndangeredAnimal{
    private String name;
    private int id;
    private final String HEALTH;
    private final String AGE;
     public EndangeredAnimal(String name, int id, String health, String age){
        this.name=name;
         HEALTH = health;
         AGE = age;
     }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getHEALTH() {
        return HEALTH;
    }

    public String getAGE() {
        return AGE;
    }
}
