/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.*;

/**
 *
 * @author felip
 */
@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pes_id")
    private Integer id;
    @Column(name = "pes_nome", nullable = false)
    private String nome;
    @Column(name = "pes_telefone", nullable = false)
    private String telefone;
    @Column(name = "pes_endereco", nullable = false)
    private String endereco;
    @Column(name = "pes_email", nullable = false)
    private String email;
    @Column(name = "pes_rg")
    private String rg;
    @Column(name = "pes_cpfcnpj", nullable = false)
    private String cpfcnpj;
    @Column(name = "pes_salario")
    private BigDecimal salario;
    @Column(name = "pes_cargo")
    private String cargo;
    @Column(name = "pes_historico_compra")
    private String historicoCompra;
    @Column(name = "pes_regiao")
    private String regiao;
    @Column(name = "pes_dia_pagamentos")
    private String diaPagamentos;
    @Column(name = "pes_tipo", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoPessoa tipo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHistoricoCompra() {
        return historicoCompra;
    }

    public void setHistoricoCompra(String historicoCompra) {
        this.historicoCompra = historicoCompra;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getDiaPagamentos() {
        return diaPagamentos;
    }

    public void setDiaPagamentos(String diaPagamentos) {
        this.diaPagamentos = diaPagamentos;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }

    public void setTipo(TipoPessoa tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.getId());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        return Objects.equals(this.getId(), other.getId());
    }

    @Override
    public String toString() {
        return this.getId().toString();
    }
}
