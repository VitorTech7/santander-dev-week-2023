package com.techSolutions.santanderdevweek2023.repository;

import com.techSolutions.santanderdevweek2023.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
