package br.com.brunoquerino.movimentosmanuais.api.controller;

import br.com.brunoquerino.movimentosmanuais.api.dto.ReadCosifDTO;
import br.com.brunoquerino.movimentosmanuais.api.dto.ReadMovimentoManualDTO;
import br.com.brunoquerino.movimentosmanuais.api.dto.ReadProdutoDTO;
import br.com.brunoquerino.movimentosmanuais.entities.MovimentoManual;
import br.com.brunoquerino.movimentosmanuais.entities.Produto;
import br.com.brunoquerino.movimentosmanuais.entities.ProdutoCosif;
import br.com.brunoquerino.movimentosmanuais.service.ProdutoCosifService;
import br.com.brunoquerino.movimentosmanuais.service.ProdutoService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CosifController {
    @Autowired
    ProdutoCosifService produtoCosifService;
    @GetMapping("/api/produtos/{codProduto}/cosifs")
    public List<ReadCosifDTO> getList(@PathVariable String codProduto) {
        List<ProdutoCosif> produtoCosifList = produtoCosifService.getListCosif(codProduto);
        return produtoCosifList.stream()
          .map(this::convertToDto)
          .collect(Collectors.toList());
    }
    private ReadCosifDTO convertToDto(ProdutoCosif produtoCosif) {
        return ReadCosifDTO.build(produtoCosif);
    }
}
