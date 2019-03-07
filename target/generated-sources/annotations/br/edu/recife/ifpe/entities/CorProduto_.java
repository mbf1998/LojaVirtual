package br.edu.recife.ifpe.entities;

import br.edu.recife.ifpe.entities.ImagemProduto;
import br.edu.recife.ifpe.entities.Produto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-03-07T19:32:22")
@StaticMetamodel(CorProduto.class)
public class CorProduto_ { 

    public static volatile ListAttribute<CorProduto, ImagemProduto> imagem;
    public static volatile SingularAttribute<CorProduto, String> nome;
    public static volatile SingularAttribute<CorProduto, Long> id;
    public static volatile SingularAttribute<CorProduto, Produto> corProduto;

}