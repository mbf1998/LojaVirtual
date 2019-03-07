package br.edu.recife.ifpe.entities;

import br.edu.recife.ifpe.entities.CorProduto;
import br.edu.recife.ifpe.entities.Pedido;
import br.edu.recife.ifpe.entities.TamanhoProduto;
import br.edu.recife.ifpe.entities.TipoProduto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-07T19:32:22")
@StaticMetamodel(Produto.class)
public class Produto_ { 

    public static volatile SingularAttribute<Produto, Float> preco;
    public static volatile SingularAttribute<Produto, Long> tipo;
    public static volatile ListAttribute<Produto, TamanhoProduto> tamanho;
    public static volatile SingularAttribute<Produto, Pedido> pedidoProduto;
    public static volatile ListAttribute<Produto, CorProduto> cor;
    public static volatile SingularAttribute<Produto, String> nome;
    public static volatile SingularAttribute<Produto, Long> id;
    public static volatile SingularAttribute<Produto, TipoProduto> tipoProduto;
    public static volatile SingularAttribute<Produto, Integer> quantidade;
    public static volatile SingularAttribute<Produto, String> descricao;

}