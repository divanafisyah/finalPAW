/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.finalpaw.demo.service;

import com.example.finalpaw.demo.entity.Laporan;
import com.example.finalpaw.demo.repo.LaporanRepo;
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
public class LaporanService {
    @Autowired
    private LaporanRepo repo;
    public Iterable<Laporan> findAll() {
    return repo.findAll();
    }
    // Function create exam data
    public void addLaporan(Laporan laporan) {
    repo.save(laporan);
    }
    //function delete
    public void deleteById (Long id){
    repo.deleteById(id);
    }
    //function edit
    public Optional<Laporan> findById(Long id){
        return repo.findById(id);
    }
    //function update
    public void updateLaporan(Laporan laporan){
    repo.save(laporan);
    }
    //function list
//    public List<Laporan> findByName(String keyword){
//        return repo.findByNameContains(keyword);
//    }
}