package com.rjrks.demo.dao;

import com.rjrks.demo.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien, Integer> {
//    List<Alien> findByTech(String tech);
//    List<Alien> findByAidGreaterThan(int aid);

//    @Query(value = "from Alien where tech=?1 order by aname")
//    List<Alien> findByTechSorted(String tech);
}
