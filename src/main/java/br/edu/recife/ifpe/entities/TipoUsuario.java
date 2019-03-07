/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.recife.ifpe.entities;

/**
 *
 * @author marcosbrasil98
 */
import java.io.Serializable;

import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author marcosbrasileiro
 */
@Entity
@Table (name="TB_TIPOUSUARIO")
@Access(AccessType.FIELD)
public class TipoUsuario implements Serializable {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column (name="TIPOUSUARIO_ID")
private long id;

@Column(name="TIPOUSUARIO_NOME",length=40)
private String nome;

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
}