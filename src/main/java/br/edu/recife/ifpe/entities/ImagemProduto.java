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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author marcosbrasil98
 */
@Entity
@Table(name="TB_IMGPRODUTO")
@Access(AccessType.FIELD)
public class ImagemProduto implements Serializable {
   
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "IMGPRODUTO_ID")
private long id;

@Lob
@Column(name="IMGPRODUTO_IMAGEM")
private String imagem;
    
@ManyToOne(fetch = FetchType.LAZY,optional = false)
@JoinColumn(name = "CORPRODUTO_ID",referencedColumnName = "IMGPRODUTO_ID")
private CorProduto corImagem;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public CorProduto getCorImagem() {
        return corImagem;
    }

    public void setCorImagem(CorProduto corImagem) {
        this.corImagem = corImagem;
    }

}
