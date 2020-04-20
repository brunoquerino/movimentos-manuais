package br.com.brunoquerino.movimentosmanuais.service.impl;

import br.com.brunoquerino.movimentosmanuais.entities.Produto;
import br.com.brunoquerino.movimentosmanuais.exception.ProdutoNotFoundException;
import br.com.brunoquerino.movimentosmanuais.repository.ProdutoRepository;
import br.com.brunoquerino.movimentosmanuais.service.ProdutoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService{
    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public List<Produto> getList() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto get(String codProduto) {
        return produtoRepository.findById(codProduto).map(produto ->{ return produto;}).orElseThrow(() -> new ProdutoNotFoundException("Produto "+codProduto+" não encontrado" ));
    }


    
}
