package br.com.brunoquerino.movimentosmanuais.api.dto;

import br.com.brunoquerino.movimentosmanuais.entities.ProdutoCosif;


public class ReadCosifDTO {
    private String codCosif;
    private String codClassificacao;

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
    public static ReadCosifDTO build(ProdutoCosif produtoCosif){
        ReadCosifDTO cosifDto = ObjectMapperUtils.map(produtoCosif, ReadCosifDTO.class);
        return cosifDto;
    }    
}
