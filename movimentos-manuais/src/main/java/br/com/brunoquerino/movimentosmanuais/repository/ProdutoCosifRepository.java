package br.com.brunoquerino.movimentosmanuais.repository;

import br.com.brunoquerino.movimentosmanuais.entities.ProdutoCosif;
import br.com.brunoquerino.movimentosmanuais.entities.ProdutoCosifId;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutoCosifRepository extends JpaRepository<ProdutoCosif, ProdutoCosifId>{
    //List<ProdutoCosif> findByCodProduto(String codProduto);
}
