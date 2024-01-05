/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.finalpaw.demo.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author DIVA
 */
@Controller
public class LaporanController {
    @GetMapping("/laporan")
    public String Laporan (Model model){
        return "laporan";
    }
    
    @GetMapping("/laporan/viewlaporan")
    public String ViewLaporan(Model model){
        return "viewlaporan";
    }
}
