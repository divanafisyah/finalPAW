/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.finalpaw.demo.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author DIVA
 */
@Entity
@Table(name = "laporan")
@NamedQueries({
    @NamedQuery(name = "Laporan.findAll", query = "SELECT l FROM Laporan l"),
    @NamedQuery(name = "Laporan.findById", query = "SELECT l FROM Laporan l WHERE l.id = :id"),
    @NamedQuery(name = "Laporan.findByTgl", query = "SELECT l FROM Laporan l WHERE l.tgl = :tgl"),
    @NamedQuery(name = "Laporan.findByJenis", query = "SELECT l FROM Laporan l WHERE l.jenis = :jenis")})
public class Laporan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tgl")
    @Temporal(TemporalType.DATE)
    private Date tgl;
    @Column(name = "jenis")
    private String jenis;

    public Laporan() {
    }

    public Laporan(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTgl() {
        return tgl;
    }

    public void setTgl(Date tgl) {
        this.tgl = tgl;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Laporan)) {
            return false;
        }
        Laporan other = (Laporan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.finalpaw.entity.Laporan[ id=" + id + " ]";
    }
    
}
