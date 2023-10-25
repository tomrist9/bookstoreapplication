package com.example.bbokstorelast.repository;

import com.example.bbokstorelast.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public class UserRepository extends JpaRepository<User, Long> {

//    @Query(value = "select u from User u where u.account.username = :username")
//    Optional<User> findByUsername(@Param(value = "username") String username) {
//
//    }
    List<User> findAll(Pageable pageable);

}