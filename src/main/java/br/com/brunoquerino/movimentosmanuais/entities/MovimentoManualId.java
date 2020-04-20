/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brunoquerino.movimentosmanuais.entities;

import java.io.Serializable;
import java.util.Objects;

public class MovimentoManualId implements Serializable{
    private int datMes;
    private int datAno;
    private long numLancamento;
    private ProdutoCosifId produtoCosif;

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(datMes,datAno,numLancamento,produtoCosif);
    }
    
}
