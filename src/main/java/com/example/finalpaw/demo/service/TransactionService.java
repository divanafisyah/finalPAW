///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.example.finalpaw.demo.service;
//
//import com.example.finalpaw.demo.entity.Transaction;
//import com.example.finalpaw.demo.repo.TransactionRepo;
//import jakarta.transaction.Transactional;
//import java.util.List;
//import java.util.Optional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
///**
// *
// * @author DIVA
// */
//@Service
//@Transactional
//public class TransactionService {
//    @Autowired
//    private TransactionRepo repo;
//    // fungsi untuk return course
//    public Iterable<Transaction> findAll() {
//    return repo.findAll();
//    }
//    // Function create exam data
//    public void addTransaction(Transaction transaction) {
//    repo.save(transaction);
//    }
//    //function delete
//    public void deleteById (Long id){
//    repo.deleteById(id);
//    }
//    //function edit
//    public Optional<Transaction> findById(Long id){
//        return repo.findById(id);
//    }
//    //function update
//    public void updateTransaction(Transaction transaction){
//    repo.save(transaction);
//    }
//    //function list
////    public List<Transaction> findByNama(String keyword){
////        return repo.findByNamaContains(keyword);
////    }
//}
