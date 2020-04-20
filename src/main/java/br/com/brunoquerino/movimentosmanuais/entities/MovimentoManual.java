/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brunoquerino.movimentosmanuais.entities;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="MOVIMENTO_MANUAL")
@IdClass(MovimentoManualId.class)
public class MovimentoManual  {

    @Column(name = "DAT_MES",columnDefinition="number")
    @Id
    int datMes;
    
    @Column(name = "DAT_ANO",columnDefinition="number")
    @Id
    int datAno;
    
    @Column(name = "NUM_LANCAMENTO",columnDefinition="number(18)")
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    long numLancamento;
    

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COD_PRODUTO",referencedColumnName="COD_PRODUTO",columnDefinition="char(4)", nullable = false)
    @JoinColumn(name = "COD_COSIF",referencedColumnName="COD_COSIF",columnDefinition="char(11)", nullable = false)
    @Fetch(FetchMode.JOIN)
    @Id
    private ProdutoCosif produtoCosif;
    
    @Column(name = "DAT_MOVIMENTO",columnDefinition="date",nullable = true)
    Date datMovimento;
    
    @Column(name = "VAL_VALOR",columnDefinition="number(18,2)",nullable = true)
    double valValor;
    
    @Column(name = "DES_DESCRICAO",columnDefinition="varchar2(50)",nullable = true)
    String desDescricao;

    @Column(name = "COD_USUARIO",columnDefinition="varchar(15)",nullable = true)
    String codUsuario;

    public int getDatMes() {
        return datMes;
    }

    public int getDatAno() {
        return datAno;
    }

    public long getNumLancamento() {
        return numLancamento;
    }

    public ProdutoCosif getProdutoCosif() {
        return produtoCosif;
    }
    



    public Date getDatMovimento() {
        return datMovimento;
    }

    public double getValValor() {
        return valValor;
    }

    public String getDesDescricao() {
        return desDescricao;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setDatMes(int datMes) {
        this.datMes = datMes;
    }

    public void setDatAno(int datAno) {
        this.datAno = datAno;
    }

    public void setNumLancamento(long numLancamento) {
        this.numLancamento = numLancamento;
    }

    public void setProdutoCosif(ProdutoCosif produtoCosif) {
        this.produtoCosif = produtoCosif;
    }

    public void setDatMovimento(Date datMovimento) {
        this.datMovimento = datMovimento;
    }

    public void setValValor(double valValor) {
        this.valValor = valValor;
    }

    public void setDesDescricao(String desDescricao) {
        this.desDescricao = desDescricao;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }
    

    

    
}
