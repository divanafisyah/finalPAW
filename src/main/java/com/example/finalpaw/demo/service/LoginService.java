/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.finalpaw.demo.service;

import com.example.finalpaw.demo.entity.Login;
import com.example.finalpaw.demo.repo.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DIVA
 */
@Service
public class LoginService {
    @Autowired
        private LoginRepository repo;
    
    public Login login(String email, String password) {
        Login user = repo.findByEmailAndPassword(email, password);
        return user;
    }
}