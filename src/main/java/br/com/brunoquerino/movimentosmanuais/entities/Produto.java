package br.com.brunoquerino.movimentosmanuais.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PRODUTO")
public class Produto implements Serializable{
    @Column(name = "COD_PRODUTO",columnDefinition="char(4)")
    @Id
    String codProduto;
    
    @Column(name = "DES_PRODUTO",columnDefinition="varchar2(30)",nullable = true)
    String desProduto;
    
    @Column(name = "STA_STATUS",columnDefinition="char(1)",nullable = true)
    String staStatus;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="COD_PRODUTO")
    List<ProdutoCosif> produtoCosifs;
    
    public String getCodProduto() {
        return codProduto;
    }

    public List<ProdutoCosif> getProdutoCosifs() {
        return produtoCosifs;
    }


    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getDesProduto() {
        return desProduto;
    }

    public void setDesProduto(String desProduto) {
        this.desProduto = desProduto;
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
        return Objects.hash(codProduto);
    }
    
    
}
