package com.JSR.online_pharmacy_management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JSR.online_pharmacy_management.Entity.Users;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    boolean existsByEmail(String email);

    Optional<Users> findByFullName(String fullName);

    Optional<Users>findByEmail(String email);

    void  deleteByFullName(String username);

}
