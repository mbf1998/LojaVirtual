/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.recife.ifpe.entities;
import java.io.Serializable;

import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author marcosbrasileiro
 */
@Entity
@Table(name="TB_ENDERECO")
@Access(AccessType.FIELD)
public class Endereco implements Serializable{
    
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="ENDERECO_ID")
 private long id;
 
 @Column(name="ENDERECO_NOME",length=100)
 private String nome;
 
 @Column(name="ENDERECO_NUMERO", length=10)
 private String numero;
 
 @Column(name="ENDERECO_COMPLEMENTO", length=200)
 
 private String complemento;
 @Column(name="ENDERECO_BAIRRO",length=20)
 private String bairro;
 
 @Column(name="ENDERECO_CIDADE", length=40)
 private String cidade;
 
 @Column(name="ENDERECO_CEP",length=20)
 private String cep;
 
 @Column(name="ENDERECO_ESTADO", length=30)
 private String estado;
 
 @Column(name="ENDERECO_PAIS",length=30)
 private String pais;

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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
 


}