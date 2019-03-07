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
@Table(name="TB_PEDIDO")
@Access(AccessType.FIELD)
public class Pedido implements Serializable{

@Id
@GeneratedValue(strategy =GenerationType.IDENTITY )
@Column(name = "PEDIDO_ID",nullable = false)
private long id;

@Column(name = "PEDIDO_LOG", nullable = false, length = 20)
private String log;

@Column(name = "PEDIDO_QUANTIDADE")
private Integer quantidade; 

@ManyToOne(fetch = FetchType.LAZY,optional = false)
@JoinColumn(name = "USUARIO_ID",referencedColumnName = "PEDIDO_ID")
private Usuario usuario;

@OneToMany(mappedBy = "pedidoProduto",fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = true)
private List<Produto> produto;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

}
