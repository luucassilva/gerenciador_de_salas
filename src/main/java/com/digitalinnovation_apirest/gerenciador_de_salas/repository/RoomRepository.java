package com.digitalinnovation_apirest.gerenciador_de_salas.exception;

import com.digitalinnovation_apirest.gerenciador_de_salas.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    
}
