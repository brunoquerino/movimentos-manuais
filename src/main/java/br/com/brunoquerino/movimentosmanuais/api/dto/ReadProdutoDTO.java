package br.com.brunoquerino.movimentosmanuais.api.dto;

import br.com.brunoquerino.movimentosmanuais.entities.Produto;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;


public class ReadProdutoDTO {
    @JsonProperty("codigo_produto")
    private String codProduto;
    @JsonProperty("descricao_produto")
    private String desProduto;
    


    public String getCodProduto() {
        return codProduto;
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
    public static ReadProdutoDTO build(Produto produto){
        ReadProdutoDTO produtoDto = ObjectMapperUtils.map(produto, ReadProdutoDTO.class);
        return produtoDto;
    }
}
