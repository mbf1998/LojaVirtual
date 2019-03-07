/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.recife.ifpe.entities;

import java.io.Serializable;
import java.util.List;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author marcosbrasil98
 */
@Entity
@Table(name="TB_CORPRODUTO")
@Access(AccessType.FIELD)
public class CorProduto implements Serializable{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="CORPRODUTO_ID")
private long id;

@Column(name = "CORPRODUTO_NOME")
private String nome;

@ManyToOne(fetch = FetchType.LAZY,optional = false)
@JoinColumn(name = "PRODUTO_ID",referencedColumnName = "CORPRODUTO_ID")
private Produto corProduto;

@OneToMany(mappedBy = "corImagem",fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = true)
private List<ImagemProduto> imagem;

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

    public Produto getCorProduto() {
        return corProduto;
    }

    public void setCorProduto(Produto corProduto) {
        this.corProduto = corProduto;
    }

    public List<ImagemProduto> getImagem() {
        return imagem;
    }

    public void setImagem(List<ImagemProduto> imagem) {
        this.imagem = imagem;
    }

}
