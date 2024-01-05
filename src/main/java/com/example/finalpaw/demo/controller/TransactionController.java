/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.finalpaw.demo.controller;

import com.example.finalpaw.demo.entity.Transaction;
import com.example.finalpaw.demo.service.TransactionService;
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
@RequestMapping("/transaksi")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;
    
    @GetMapping("/list")
    public String courses(Model model) {
        model.addAttribute("activePage", "Transaksi");
        model.addAttribute("Transaksi", transactionService.findAll());
//        model.addAttribute("searchForm", new SearchFormData());
        return "Transaksi";
    }

    @GetMapping("/view/{id}")
    public String showView (@PathVariable Long id, Model model) {
        //Panggil metode layanan untuk mendapatkan data berdasarkan ID
        Optional<Transaction> transaction = transactionService.findById(id);
        //Simpan data ke model untuk digunakan ditampilan
        model.addAttribute("transaction", transaction);
        model.addAttribute("activePage", "transaction");

        //Kembalikan nama tampilan yang sesuai
        return "viewTransaction";
    }

    @GetMapping("/addTransaction")
    public String addTransaction(Model model) {
        model.addAttribute("activePage", "transaction");
        model.addAttribute("transaction", new Transaction());
        return "addTransaction";
    }

    @PostMapping("/save")
    public String save(Transaction transaction, Model model) {
        transactionService.addTransaction(transaction);
        return "redirect:/transaction";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
    // Panggil service untuk melakukan penghapusan
    transactionService.deleteById(id);
    // Redirect ke halaman "/transaction"
    return "redirect:/transaction";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model){
    // Panggil service untuk melakukan edit
    model.addAttribute("transaction", transactionService.findById(id));
    // membuka halaman "/transaction"
    return "/editTransaction";
    }
    @PostMapping("/update")
    public String update(Transaction transaction, Model model) {
    // call service update
    transactionService.updateTransaction(transaction);
     // redirect ke halaman "/transaction"
    return "redirect:/transaction";
    }
}