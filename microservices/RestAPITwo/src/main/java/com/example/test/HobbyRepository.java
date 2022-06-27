package com.example.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbyRepository extends JpaRepository<HobbyEntity, Integer> {
    
       @Query("SELECT h.hobby FROM HobbyEntity h WHERE h.personId=:personId")
        public String findByPersonId(Integer personId);

}


