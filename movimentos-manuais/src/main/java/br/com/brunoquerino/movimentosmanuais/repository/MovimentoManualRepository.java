package br.com.brunoquerino.movimentosmanuais.repository;

//import br.com.brunoquerino.movimentosmanuais.entities.MovimentoManual;
import br.com.brunoquerino.movimentosmanuais.entities.MovimentoManual;
import br.com.brunoquerino.movimentosmanuais.entities.MovimentoManualId;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface MovimentoManualRepository extends JpaRepository<MovimentoManual, MovimentoManualId>{

}
