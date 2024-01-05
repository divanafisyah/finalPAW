/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.finalpaw.demo.repo;

import com.example.finalpaw.demo.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DIVA
 */
@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{
    Login findByEmailAndPassword(String email, String password);
}