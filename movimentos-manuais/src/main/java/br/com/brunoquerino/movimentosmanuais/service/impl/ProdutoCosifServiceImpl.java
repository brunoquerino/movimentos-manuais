package br.com.brunoquerino.movimentosmanuais.service.impl;

import br.com.brunoquerino.movimentosmanuais.entities.Produto;
import br.com.brunoquerino.movimentosmanuais.entities.ProdutoCosif;
import br.com.brunoquerino.movimentosmanuais.entities.ProdutoCosifId;
import br.com.brunoquerino.movimentosmanuais.exception.ProdutoCosifNotFoundException;
import br.com.brunoquerino.movimentosmanuais.exception.ProdutoNotFoundException;
import br.com.brunoquerino.movimentosmanuais.repository.ProdutoCosifRepository;
import br.com.brunoquerino.movimentosmanuais.repository.ProdutoRepository;
import br.com.brunoquerino.movimentosmanuais.service.ProdutoCosifService;
import br.com.brunoquerino.movimentosmanuais.service.ProdutoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoCosifServiceImpl implements ProdutoCosifService{
    @Autowired
    private ProdutoCosifRepository produtoCosifRepository;
    @Autowired
    private ProdutoService produtoService;
    @Autowired
    private ProdutoRepository produtoRepository;
    @Override
    public List<ProdutoCosif> getListCosif(String codProduto) {
        Optional<Produto> produto = produtoRepository.findById(codProduto);
        if(produto.isPresent()){
            return produto.get().getProdutoCosifs();
        }
        return null;
    }

    @Override
    public ProdutoCosif get(ProdutoCosifId produtoCosifId) {
        //return produtoCosifRepository.findById(produtoCosifId).map(produtoCosif ->{ return produtoCosif;}).orElseThrow(() -> new ProdutoCosifNotFoundException("Relação do produto "+produtoCosifId.getProduto().getCodProduto()+" com COSIF: "+produtoCosifId.getCodCosif()+" não encontrada" ));
        return produtoCosifRepository.findById(produtoCosifId).map(produtoCosif ->{ return produtoCosif;}).orElseThrow(() -> new ProdutoCosifNotFoundException("Relação do produto  não encontrada" ));
    }
    
}
