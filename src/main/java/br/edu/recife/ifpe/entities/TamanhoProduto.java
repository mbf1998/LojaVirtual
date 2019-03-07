/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.recife.ifpe.entities;

import java.io.Serializable;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author marcosbrasil98
 */
@Entity
@Table(name="TB_TAMANHOPRODUTO")
@Access(AccessType.FIELD)
public class TamanhoProduto implements Serializable{
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="TAMANHOPRODUTO_ID")
 private long id;
 
 @Column(name="TAMANHOPRODUTO_NOME")
 private String nome;
 
 @Column(name="TAMANHOPRODUTO_ALTURA")
 private float altura;
 
 @Column(name="TAMANHOPRODUTO_COMPRIMENTO")
 private float comprimento;
 
 @Column(name="TAMANHOPRODUTO_LARGURA")
 private float largura;
 
 @ManyToOne(fetch = FetchType.LAZY,optional=false)
 @JoinColumn(name="PRODUTO_ID",referencedColumnName = "TAMANHOPRODUTO_ID")
 private Produto tamanhoProduto;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public Produto getTamanhoProduto() {
        return tamanhoProduto;
    }

    public void setTamanhoProduto(Produto tamanhoProduto) {
        this.tamanhoProduto = tamanhoProduto;
    }
 
}
