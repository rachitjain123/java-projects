package com.rjrks.demo.Controller;

import com.rjrks.demo.dao.AlienRepo;
import com.rjrks.demo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class  AlienController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/alien")
    public Alien addAlien(@RequestBody  Alien alien) {
        repo.save(alien);
        return alien;
    }

    @DeleteMapping("/alien/{aid}")
    public String deleteAlien(@PathVariable int aid) {
        Alien a = repo.getOne(aid);
        repo.delete(a);
        return "Deleted";
    }

//    @RequestMapping("/getAlien")
//    public ModelAndView getAlien(@RequestParam int aid) {
//        ModelAndView mv = new ModelAndView("showAlien");
//        Alien alien = repo.findById(aid).orElse(new Alien());
//        mv.addObject(alien);
//        System.out.println(repo.findByTech("Java"));
//        System.out.println(repo.findByTechSorted("Java"));
//
//        return mv;
//    }

    @GetMapping ("/aliens")
    public List<Alien> getAliens() {
        return repo.findAll();
    }

    @RequestMapping("/alien/{aid}")
    public Optional<Alien> getAliens(@PathVariable("aid") int aid) {
        return repo.findById(aid);
    }
}
