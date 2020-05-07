package com.rjrks;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository {
    List<Alien> aliens;

    public AlienRepository() {
        aliens = new ArrayList<Alien>();
        Alien a1 = new Alien();
        a1.setName("rachit");
        a1.setPoints(100);
        a1.setId(101);

        Alien a2 = new Alien();
        a2.setName("Aarti");
        a2.setPoints(70);
        a2.setId(102);

        aliens.add(a1);
        aliens.add(a2);

    }

    public List<Alien> getAliens() {
        return aliens;
    }

    public Alien getAlien(int id) {
        for(Alien a:aliens) {
            if(a.getId() == id)
                return a;
        }
        return null;
    }

    public void create(Alien a1) {
        aliens.add(a1);
    }
}
