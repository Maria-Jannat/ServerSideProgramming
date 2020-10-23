package com.example.repo;

import com.example.entity.Principaal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrincipaalRepository extends JpaRepository<Principaal, Long> {
}
