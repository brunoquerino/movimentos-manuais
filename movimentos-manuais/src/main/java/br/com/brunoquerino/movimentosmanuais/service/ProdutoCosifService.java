package br.com.brunoquerino.movimentosmanuais.service;

import br.com.brunoquerino.movimentosmanuais.entities.ProdutoCosif;
import br.com.brunoquerino.movimentosmanuais.entities.ProdutoCosifId;
import java.util.List;


public interface ProdutoCosifService {
    public List<ProdutoCosif> getListCosif(String codProduto);
    public ProdutoCosif get(ProdutoCosifId produtoCosifId);
}
