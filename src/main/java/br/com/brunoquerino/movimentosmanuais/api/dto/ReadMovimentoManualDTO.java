
package br.com.brunoquerino.movimentosmanuais.api.dto;

import br.com.brunoquerino.movimentosmanuais.entities.MovimentoManual;
import br.com.brunoquerino.movimentosmanuais.entities.Produto;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReadMovimentoManualDTO {
    @JsonProperty("mes")
    private int datMes;    
    @JsonProperty("ano")
    private int datAno;
    @JsonProperty("numero")
    private long numLancamento;
    private ReadProdutoDTO produto;
    @JsonProperty("valor")
    private double valValor;
    @JsonProperty("descricao")
    private String desDescricao;
    

    public int getDatMes() {
        return datMes;
    }

    public int getDatAno() {
        return datAno;
    }

    public long getNumLancamento() {
        return numLancamento;
    }

    public ReadProdutoDTO getProduto() {
        return produto;
    }

    public double getValValor() {
        return valValor;
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

    public void setProduto(ReadProdutoDTO produto) {
        this.produto = produto;
    }

    public void setValValor(double valValor) {
        this.valValor = valValor;
    }

    public String getDesDescricao() {
        return desDescricao;
    }

    public void setDesDescricao(String desDescricao) {
        this.desDescricao = desDescricao;
    }
    
    public static ReadMovimentoManualDTO build(MovimentoManual movimentoManual){
        ReadMovimentoManualDTO movimentoManualDto = ObjectMapperUtils.map(movimentoManual, ReadMovimentoManualDTO.class);
        //movimentoManualDto.setProduto(movimentoManual.getProdutoCosif().getProduto());
        movimentoManualDto.setProduto(ReadProdutoDTO.build(movimentoManual.getProdutoCosif().getProduto()));
        return movimentoManualDto;
    }
}
