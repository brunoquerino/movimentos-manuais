package br.com.brunoquerino.movimentosmanuais.repository;

import br.com.brunoquerino.movimentosmanuais.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutoRepository extends JpaRepository<Produto, String> {

    
}
