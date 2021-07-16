package com.matheuscordeiro.accesscontrolapi.controllers;

import com.matheuscordeiro.accesscontrolapi.models.JourneyWork;
import com.matheuscordeiro.accesscontrolapi.services.JourneyWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/journeys")
public class JourneyWorkController {
    @Autowired
    private final JourneyWorkService journeyWorkService;

    public JourneyWorkController(JourneyWorkService journeyWorkService) {
        this.journeyWorkService = journeyWorkService;
    }

    @GetMapping
    public ResponseEntity<List<JourneyWork>> getAllJourneyWork(){
        return ResponseEntity.ok(journeyWorkService.findAllJourneyWork());
    }

    @GetMapping("/{id}")
    public ResponseEntity<JourneyWork>  getJourneyWorkByID(@PathVariable("id") Long id) throws Exception {
        return  ResponseEntity.ok(journeyWorkService.findJourneyWorkById(id).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }

    @PostMapping
    public ResponseEntity<JourneyWork> createJourneyWork(@RequestBody JourneyWork JourneyWork){
        return new ResponseEntity<JourneyWork>(journeyWorkService.saveJourneyWork(JourneyWork), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<JourneyWork> updateJourneyWork(@RequestBody JourneyWork JourneyWork){
        return ResponseEntity.ok(journeyWorkService.updateJourneyWork(JourneyWork));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJourneyWorkById(@PathVariable("id") Long id) throws NoSuchElementException {
        try {
            journeyWorkService.deleteJourneyWork(id);
            return ResponseEntity.noContent().build();
        }catch (Exception e) {
            throw new NoSuchElementException("Not found!");
        }
    }
}
