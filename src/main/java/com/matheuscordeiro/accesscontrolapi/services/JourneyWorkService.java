package com.matheuscordeiro.accesscontrolapi.services;

import com.matheuscordeiro.accesscontrolapi.models.JourneyWork;
import com.matheuscordeiro.accesscontrolapi.repositories.JourneyWorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JourneyWorkService {
    private final JourneyWorkRepository journeyWorkRepository;

    @Autowired
    public JourneyWorkService(JourneyWorkRepository journeyWorkRepository) {
        this.journeyWorkRepository = journeyWorkRepository;
    }

    public JourneyWork saveJourneyWork(JourneyWork journeyWork){
        return journeyWorkRepository.save(journeyWork);
    }

    public List<JourneyWork> findAllJourneyWork() {
        return journeyWorkRepository.findAll();
    }

    public Optional<JourneyWork> findJourneyWorkById(Long id) {
        return journeyWorkRepository.findById(id);
    }

    public JourneyWork updateJourneyWork(JourneyWork journeyWork){
        return journeyWorkRepository.save(journeyWork);

    }

    public void deleteJourneyWork(Long id) {
        journeyWorkRepository.deleteById(id);
    }
}
