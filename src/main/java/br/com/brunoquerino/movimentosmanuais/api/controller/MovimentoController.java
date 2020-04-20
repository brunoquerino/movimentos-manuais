package br.com.brunoquerino.movimentosmanuais.api.controller;

import br.com.brunoquerino.movimentosmanuais.api.dto.ReadMovimentoManualDTO;
import br.com.brunoquerino.movimentosmanuais.api.dto.CreateMovimentoManualDTO;
import br.com.brunoquerino.movimentosmanuais.api.dto.ObjectMapperUtils;
import br.com.brunoquerino.movimentosmanuais.entities.MovimentoManual;
import br.com.brunoquerino.movimentosmanuais.entities.Produto;
import br.com.brunoquerino.movimentosmanuais.entities.ProdutoCosifId;
import br.com.brunoquerino.movimentosmanuais.service.MovimentoManualService;
import br.com.brunoquerino.movimentosmanuais.service.ProdutoCosifService;
import br.com.brunoquerino.movimentosmanuais.service.ProdutoService;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movimentos")
public class MovimentoController {

    @Autowired
    private MovimentoManualService movimentoManualService;
    
    @Autowired
    private ProdutoService produtoService;
    @Autowired
    private ProdutoCosifService produtoCosifService;
    
    @GetMapping
    public List<ReadMovimentoManualDTO> getList() {
        List<MovimentoManual> movimentoManualList = movimentoManualService.getList();
        return movimentoManualList.stream()
          .map(this::convertToDto)
          .collect(Collectors.toList());
    }
    @PostMapping()
    public ReadMovimentoManualDTO incluirMovimentoManual(@Valid @RequestBody CreateMovimentoManualDTO createMovimentoManualDTO) {
        //PersistenceUnitUtil util = emf.getPersistenceUnitUtil();
        MovimentoManual movimentoManual = ObjectMapperUtils.map(createMovimentoManualDTO, MovimentoManual.class);
        movimentoManual.setCodUsuario("TESTE");
        ProdutoCosifId produtoCosifId = ObjectMapperUtils.map(createMovimentoManualDTO, ProdutoCosifId.class);
        produtoCosifId.setCodCosif(createMovimentoManualDTO.getCodCosif());
        Produto produto = produtoService.get(createMovimentoManualDTO.getCodProduto());
        produtoCosifId.setProduto(produto.getCodProduto());
        movimentoManual.setProdutoCosif(produtoCosifService.get(produtoCosifId));
        
        
        
        return ReadMovimentoManualDTO.build(movimentoManualService.save(movimentoManual));
       
        
    }
    private ReadMovimentoManualDTO convertToDto(MovimentoManual movimentoManual) {
        return ReadMovimentoManualDTO.build(movimentoManual);
    }
}
