package br.com.brunoquerino.movimentosmanuais.api.controller;

import br.com.brunoquerino.movimentosmanuais.api.dto.ReadProdutoDTO;
import br.com.brunoquerino.movimentosmanuais.entities.Produto;
import br.com.brunoquerino.movimentosmanuais.repository.ProdutoRepository;
import br.com.brunoquerino.movimentosmanuais.service.ProdutoService;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;



    @GetMapping
    public List<ReadProdutoDTO> getList() {
        List<Produto> produtoList = produtoService.getList();
        return produtoList.stream()
          .map(this::convertToDto)
          .collect(Collectors.toList());
    }


    private ReadProdutoDTO convertToDto(Produto produto) {
        return ReadProdutoDTO.build(produto);
    }
}
