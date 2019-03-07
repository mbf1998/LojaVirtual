/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.recife.ifpe.entities;

import java.io.Serializable;

import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author marcosbrasileiro
 */
@Entity
@Table (name="TB_USUARIO")
@Access(AccessType.FIELD)

public class Usuario implements Serializable {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column (name="USUARIO_ID")
private long id;

@Column (name="USUARIO_NOME", length=40)
private String nome;

@Temporal(TemporalType.DATE)
@Column(name="USUARIO_DATANASCIMENTO")
private Date dataNascimento;

@Column(name="USUARIO_EMAIL",length=40)
private String email;

@Column(name="USUARIO_CPF",length=15)
private String cpf;

@Column(name="USUARIO_CELULAR", length=20)
private String celular;

@Column(name="USUARIO_FIXO",length=20)
private String fixo;

@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL,optional=false)
@JoinColumn(name="ENDERECO_ID",referencedColumnName = "USUARIO_ID")
private Endereco endereco;

@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL,optional=false)
@JoinColumn(name="TIPOUSUARIO_ID",referencedColumnName = "USUARIO_ID")
private TipoUsuario tipoUsuario;

@OneToMany(mappedBy = "usuario",fetch = FetchType.LAZY, cascade = CascadeType.ALL,orphanRemoval = true)
private List<Pedido> pedidoUsuario;

    
   

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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFixo() {
        return fixo;
    }

    public void setFixo(String fixo) {
        this.fixo = fixo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public List<Pedido> getPedido() {
        return pedidoUsuario;
    }

    public void setPedido(List<Pedido> pedido) {
        this.pedidoUsuario = pedido;
    }

}
