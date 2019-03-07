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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author marcosbrasil98
 */
@Entity
@Table(name = "TB_PRODUTO")
@Access(AccessType.FIELD)
public class Produto implements Serializable{
  
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "PRODUTO_ID")
private long id;

@Column(name = "PRODUTO_TIPOPRODUTO")
private long tipo;
@Column(name = "PRODUTO_NOME",length=30)
private String nome;

@Lob
@Column(name = "PRODUTO_DESCRICAO")
private String descricao;

@Column(name="PRODUTO_QUANTIDADE")
private Integer quantidade;

@Column(name = "PRODUTO_PRECO")
private float preco;

@ManyToOne(fetch = FetchType.LAZY,optional = false)
@JoinColumn(name="PEDIDO_ID",referencedColumnName = "PRODUTO_ID")
private Pedido pedidoProduto;

@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL,optional=false)
@JoinColumn(name="TIPOPRODUTO_ID",referencedColumnName = "PRODUTO_TIPOPRODUTO")
private TipoProduto tipoProduto;

@OneToMany(mappedBy = "tamanhoProduto",fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = true)
private List<TamanhoProduto> tamanho;

@OneToMany(mappedBy = "corProduto",fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = true)
private List<CorProduto> cor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTipo() {
        return tipo;
    }

    public void setTipo(long tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Pedido getPedidoProduto() {
        return pedidoProduto;
    }

    public void setPedidoProduto(Pedido pedidoProduto) {
        this.pedidoProduto = pedidoProduto;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public List<TamanhoProduto> getTamanho() {
        return tamanho;
    }

    public void setTamanho(List<TamanhoProduto> tamanho) {
        this.tamanho = tamanho;
    }

    public List<CorProduto> getCor() {
        return cor;
    }

    public void setCor(List<CorProduto> cor) {
        this.cor = cor;
    }

}
