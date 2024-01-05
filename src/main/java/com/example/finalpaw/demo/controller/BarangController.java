/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.finalpaw.demo.controller;

import com.example.finalpaw.demo.entity.Barang;
import com.example.finalpaw.demo.service.BarangService;
import com.example.finalpaw.demo.dto.SearchFormData;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author DIVA
 */
@Controller
//@RequestMapping("/barang")
public class BarangController {

    @Autowired
    private BarangService barangService;

    @GetMapping("/list")
    public String courses(Model model) {
        model.addAttribute("activePage", "Barang");
        model.addAttribute("Barang", barangService.findAll());
        model.addAttribute("searchForm", new SearchFormData());
        return "Barang";
    }

    @GetMapping("/view/{id}")
    public String showView(@PathVariable Long id, Model model) {
        // Dapatkan data barang berdasarkan ID
        Optional<Barang> barang = barangService.findById(id);
        // Jika data tidak ditemukan, tampilkan pesan error
        if (barang == null) {
            model.addAttribute("error", "Data barang tidak ditemukan");
            return "error";
        }
        // Tambahkan data barang ke model
        model.addAttribute("Barang", barang);
        // Tampilkan view
        return "view";
    }

    @GetMapping("/addBarang")
    public String addBarang(Model model) {
        model.addAttribute("activePage", "Barang");
        model.addAttribute("Barang", new Barang());
        return "addBarang";
    }

    @PostMapping("/save")
    public String save(Barang barang, Model model) {
        barangService.addBarang(barang);
        return "redirect:/barang";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        // Panggil service untuk melakukan penghapusan
        barangService.deleteById(id);
        // Redirect ke halaman "/barang"
        return "redirect:/barang";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        // Panggil service untuk melakukan edit
        model.addAttribute("barang", barangService.findById(id));
        // membuka halaman "/barang"
        return "/editBarang";
    }

    @PostMapping("/update")
    public String update(Barang barang, Model model) {
        // call service update
        barangService.updateBarang(barang);
        // redirect ke halaman "/barang"
        return "redirect:/barang";
    }

//    @GetMapping("/search")
//    public String search(SearchFormData searchFormData, Model model) {
//        model.addAttribute("searchForm", searchFormData);
//        model.addAttribute("exam",
//                barangService.findByNama(searchFormData.getKeyword()));
//        return "barang";
//    }
}
