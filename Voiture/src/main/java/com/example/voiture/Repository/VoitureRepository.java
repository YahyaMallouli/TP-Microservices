package com.example.voiture.Repository;


import com.example.voiture.Modal.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {

//    @Query("SELECT v FROM Voiture v WHERE v.client.id = :clientId")
//    List<Voiture> findByClientId(@Param("clientId") Long clientId);

}
