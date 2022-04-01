package com.controller;

import com.model.Dancer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.service.DancerService;

import java.util.List;

@RestController
public class DancerController {
    private final DancerService dancerService;

    @Autowired
    public DancerController(DancerService dancerService) {
        this.dancerService = dancerService;
    }

    @GetMapping("/dancers")
    public ResponseEntity<List<Dancer>> read() {
        final List<Dancer> dancers= dancerService.readAll();

        return dancers != null
               ? new ResponseEntity<>(dancers, HttpStatus.OK)
               : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/dancers/code/{code}")
    public ResponseEntity<List<Dancer>> getDancerByCode(@PathVariable(name = "code") Integer code){
        final List<Dancer> dancers = dancerService.getDancerByCode(code);
        return dancers  != null
               ? new ResponseEntity<>(dancers, HttpStatus.OK)
               : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    };

    @GetMapping("/dancers/fullname/{fullname}")
    public ResponseEntity<List<Dancer>> getDancersByName(@PathVariable(name = "fullname") String name) {
        final List<Dancer> dancers = dancerService.getDancersByName(name);

        return dancers != null
               ? new ResponseEntity<>(dancers, HttpStatus.OK)
               : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/dancers/club/{club}")
    public ResponseEntity<List<Dancer>> getDancersByClub(@PathVariable(name = "club") String club) {
        final List<Dancer> dancers = dancerService.getDancersByClub(club);

        return dancers != null
               ? new ResponseEntity<>(dancers, HttpStatus.OK)
               : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/")
    public String index() {
        return "Welcome to Heroku demo !!";
    }
}
