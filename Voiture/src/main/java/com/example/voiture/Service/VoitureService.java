package com.example.voiture.Service;

import com.example.voiture.Modal.Voiture;
import com.example.voiture.Repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoitureService {

    @Autowired
    private VoitureRepository voitureRepository;

    public Voiture enregistrerVoiture(Voiture voiture){
        return voitureRepository.save(voiture);
    }
}
