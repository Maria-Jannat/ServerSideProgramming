package com.coderbd.repo;

import com.coderbd.entity.Principal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrincipalRepository extends JpaRepository<Principal,Long> {
}
