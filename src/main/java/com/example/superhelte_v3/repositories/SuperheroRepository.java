package com.example.superhelte_v3.repositories;

import com.example.superhelte_v3.DTO.heroCityDTO;
import com.example.superhelte_v3.DTO.heroPowerCountDTO;
import com.example.superhelte_v3.DTO.heroPowersDTO;
import com.example.superhelte_v3.model.Superhero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SuperheroRepository /*implements IRepositories*/{

    private ArrayList<Superhero> superheroDatabase = new ArrayList<>(List.of(
            new Superhero("Superhero1", "realname1", 1990),
            new Superhero("Superhero2", "realname2", 1994),
            new Superhero("Superhero3", "realname3", 1992)
    ));
/*
    public ArrayList<Superhero> getSuperheroesFromDB();
    public ArrayList<heroPowerCountDTO> getHeroPowerCount();
    public ArrayList<heroPowersDTO> getHeroPowers(String name);
    public ArrayList<heroCityDTO> getHeroCity(String name);
*/

}
