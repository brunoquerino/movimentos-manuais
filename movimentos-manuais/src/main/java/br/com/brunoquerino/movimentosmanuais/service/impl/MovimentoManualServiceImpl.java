package br.com.brunoquerino.movimentosmanuais.service.impl;

import br.com.brunoquerino.movimentosmanuais.entities.MovimentoManual;
import br.com.brunoquerino.movimentosmanuais.repository.MovimentoManualRepository;
import br.com.brunoquerino.movimentosmanuais.service.MovimentoManualService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class MovimentoManualServiceImpl implements MovimentoManualService{
    @Autowired
    private MovimentoManualRepository movimentoManualRepository;
    
    @Override
    public List<MovimentoManual> getList() {
        return movimentoManualRepository.findAll(Sort.by(Sort.Direction.ASC, "datMes").and(Sort.by(Sort.Direction.ASC, "datAno")).and(Sort.by(Sort.Direction.ASC, "numLancamento")));
    }    

    @Override
    public MovimentoManual save(MovimentoManual movimentoManual) {
        return movimentoManualRepository.save(movimentoManual);
    }
}
