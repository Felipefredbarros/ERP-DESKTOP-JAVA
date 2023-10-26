/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.*;

/**
 *
 * @author felip
 */
@Entity
@Table(name = "produto")
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_id")
    private Long id;
    @Column(name = "prod_tipo", nullable = false)
    private String tipo;
    @Column(name = "prod_numeracao", nullable = false)
    private String numeracao;
    @Column(name = "prod_cor", nullable = false)
    private String cor;
    @Column(name = "prod_ncm", nullable = false)
    private String ncm;
    @Column(name = "prod_valorUnitarioVenda")
    private BigDecimal valorUnitarioVenda;
    @Column(name = "prod_valorUnitarioCompra")
    private BigDecimal valorUnitarioCompra;
    @Column(name = "prod_quantidade", nullable = false)
    private Double estoque;
    @Column(name = "prod_cont")
    private Double cont;

    public Double getCont() {
        return cont;
    }

    public void setCont(Double cont) {
        this.cont = cont;
    }
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public BigDecimal getValorUnitarioVenda() {
        return valorUnitarioVenda;
    }

    public void setValorUnitarioVenda(BigDecimal valorUnitarioVenda) {
        this.valorUnitarioVenda = valorUnitarioVenda;
    }

    public BigDecimal getValorUnitarioCompra() {
        return valorUnitarioCompra;
    }

    public void setValorUnitarioCompra(BigDecimal valorUnitarioCompra) {
        this.valorUnitarioCompra = valorUnitarioCompra;
    }

    public Double getEstoque() {
        return estoque;
    }

    public void setEstoque(Double quantidade) {
        this.estoque = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.getId());
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
        final Produto other = (Produto) obj;
        return Objects.equals(this.getId(), other.getId());
    }

    @Override
    public String toString() {
        return "Tipo " + getTipo() + " Numeração " + getNumeracao() + " Cor " + getCor(); 
    }

}
