package br.com.brunoquerino.movimentosmanuais.service;

import br.com.brunoquerino.movimentosmanuais.entities.Produto;
import java.util.List;


public interface ProdutoService {
    public List<Produto> getList();
    public Produto get(String codProduto);
    
}
