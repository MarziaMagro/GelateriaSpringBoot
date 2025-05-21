package com.example.gelateria.repository;

import com.example.gelateria.entity.FrozenYogurt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository automatizzato
 * -->Jpa repository
 */

@Repository
public interface FrozenYogurtRepo extends JpaRepository<FrozenYogurt, Integer> {
}
