package com.ditraacademy.travelagency.core.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {


     Optional<User> findByMail(String mail ) ;
}
