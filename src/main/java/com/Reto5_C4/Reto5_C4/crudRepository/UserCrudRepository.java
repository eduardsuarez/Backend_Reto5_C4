/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Reto5_C4.Reto5_C4.crudRepository;

import com.Reto5_C4.Reto5_C4.entity.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author eduardsuarez21
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {

    public Optional<User> findByEmail(String email);

    public Optional<User> findByEmailAndPassword(String email, String password);
    
    Optional<User> findTopByOrderByIdDesc();
    
    List<User> findByMonthBirthtDay(String monthBirthtDay);
}
