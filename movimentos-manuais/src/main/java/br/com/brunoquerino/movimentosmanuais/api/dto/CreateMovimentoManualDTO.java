
package br.com.brunoquerino.movimentosmanuais.api.dto;

import br.com.brunoquerino.movimentosmanuais.entities.MovimentoManual;
import br.com.brunoquerino.movimentosmanuais.entities.Produto;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateMovimentoManualDTO {
    @JsonProperty("mes")
    private int datMes;    
    @JsonProperty("ano")
    private int datAno;
    @JsonProperty("codigo_produto")
    private String codProduto;
    @JsonProperty("valor")
    double valValor;
    @JsonProperty("codigo_cosif")
    private String codCosif;
    @JsonProperty("descricao")
    private String desDescricao;

    public int getDatMes() {
        return datMes;
    }

    public void setDatMes(int datMes) {
        this.datMes = datMes;
    }

    public int getDatAno() {
        return datAno;
    }

    public void setDatAno(int datAno) {
        this.datAno = datAno;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public double getValValor() {
        return valValor;
    }

    public void setValValor(double valValor) {
        this.valValor = valValor;
    }

    public String getCodCosif() {
        return codCosif;
    }

    public void setCodCosif(String codCosif) {
        this.codCosif = codCosif;
    }

    public String getDesDescricao() {
        return desDescricao;
    }

    public void setDesDescricao(String desDescricao) {
        this.desDescricao = desDescricao;
    }
    

}
