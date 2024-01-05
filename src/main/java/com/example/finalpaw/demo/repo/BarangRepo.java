/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.finalpaw.demo.repo;

import com.example.finalpaw.demo.entity.Barang;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author DIVA
 */
public interface BarangRepo extends CrudRepository<Barang, Long> {
//    List <Barang> findByNameContains(String keyword);
    public List<Barang> findByNamaContains(String keyword);
}