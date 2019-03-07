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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author marcosbrasil98
 */
@Entity
@Table(name="TB_TIPOPRODUTO")
@Access(AccessType.FIELD)
public class TipoProduto implements Serializable{
  
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "TIPOPRODUTO_ID")
private long id;

@Column(name = "TIPOPRODUTO_NOME")
private String nome;
}
