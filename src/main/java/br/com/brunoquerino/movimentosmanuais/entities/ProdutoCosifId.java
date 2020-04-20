package br.com.brunoquerino.movimentosmanuais.entities;

import java.io.Serializable;
import java.util.Objects;

public class ProdutoCosifId implements Serializable{
    private String produto;    
    private String codCosif;
    public ProdutoCosifId() {
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCodCosif() {
        return codCosif;
    }

    public void setCodCosif(String codCosif) {
        this.codCosif = codCosif;
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
