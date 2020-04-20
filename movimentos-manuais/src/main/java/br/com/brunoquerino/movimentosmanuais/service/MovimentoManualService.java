package br.com.brunoquerino.movimentosmanuais.service;

import br.com.brunoquerino.movimentosmanuais.entities.MovimentoManual;
import java.util.List;


public interface MovimentoManualService {
    public List<MovimentoManual> getList();
    public MovimentoManual save(MovimentoManual movimentoManual);
}
