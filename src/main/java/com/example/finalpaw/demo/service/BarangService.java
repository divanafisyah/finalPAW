/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.finalpaw.demo.service;

import com.example.finalpaw.demo.entity.Barang;
import com.example.finalpaw.demo.repo.BarangRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DIVA
 */
@Service
@Transactional
public class BarangService {
    @Autowired
    private BarangRepo repo;
    public Iterable<Barang> findAll() {
    return repo.findAll();
    }
    // Function create data barang
    public void addBarang(Barang barang) {
    repo.save(barang);
    }
    //function delete
    public void deleteById (Long id){
    repo.deleteById(id);
    }
    //function edit
    public Optional<Barang> findById(Long id){
        return repo.findById(id);
    }
    //function update
    public void updateBarang(Barang barang){
    repo.save(barang);
    }
    //function list
    public List<Barang> findByNama(String keyword){
        return repo.findByNamaContains(keyword);
    }
}