/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brunoquerino.movimentosmanuais.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="PRODUTO_COSIF")
@IdClass(ProdutoCosifId.class)
public class ProdutoCosif implements Serializable {
    
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COD_PRODUTO",referencedColumnName="COD_PRODUTO",columnDefinition="char(4)", nullable = false)
    @Fetch(FetchMode.JOIN)
    @Id
    private Produto produto;
/*    @Column(name = "COD_PRODUTO",columnDefinition="char(4)")
    @Id
    String codProduto;*/
    
    @Id
    @Column(name = "COD_COSIF",columnDefinition="char(11)")
    private String codCosif;
    
    @Column(name = "COD_CLASSSIFICACAO",columnDefinition="char(6)",nullable = true)
    private String codClassificacao;
    
    @Column(name = "STA_STATUS",columnDefinition="char(1)",nullable = true)
    private String staStatus;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getCodCosif() {
        return codCosif;
    }



    public void setCodCosif(String codCosif) {
        this.codCosif = codCosif;
    }

    public String getCodClassificacao() {
        return codClassificacao;
    }

    public void setCodClassificacao(String codClassificacao) {
        this.codClassificacao = codClassificacao;
    }

    public String getStaStatus() {
        return staStatus;
    }

    public void setStaStatus(String staStatus) {
        this.staStatus = staStatus;
    }

    
    

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(produto,codCosif);
    }
}
