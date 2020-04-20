/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brunoquerino.movimentosmanuais.service.impl;

import br.com.brunoquerino.movimentosmanuais.api.dto.CreateMovimentoManualDTO;
import br.com.brunoquerino.movimentosmanuais.api.dto.ObjectMapperUtils;
import br.com.brunoquerino.movimentosmanuais.api.dto.ReadMovimentoManualDTO;
import br.com.brunoquerino.movimentosmanuais.entities.MovimentoManual;
import br.com.brunoquerino.movimentosmanuais.entities.Produto;
import br.com.brunoquerino.movimentosmanuais.entities.ProdutoCosif;
import br.com.brunoquerino.movimentosmanuais.entities.ProdutoCosifId;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.runner.RunWith;



import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MovimentoManualServiceTest {
    
    public MovimentoManualServiceTest() {
    }
    
    @Test
    public void testGetList() {
        System.out.println("Teste DTO integridade");
        Produto produto = new Produto();
        produto.setCodProduto("999");
        produto.setDesProduto("produto teste");
        ProdutoCosif produtoCosif = new ProdutoCosif();
        produtoCosif.setCodClassificacao("0101");
        produtoCosif.setCodCosif("01");
        produtoCosif.setProduto(produto);
        produtoCosif.setStaStatus("A");
        CreateMovimentoManualDTO createMovimentoManualDTO = new CreateMovimentoManualDTO();
        createMovimentoManualDTO.setCodCosif("1");
        createMovimentoManualDTO.setCodProduto(produto.getCodProduto());
        createMovimentoManualDTO.setDatAno(2020);
        createMovimentoManualDTO.setDatMes(12);
        createMovimentoManualDTO.setDesDescricao("teste");
        createMovimentoManualDTO.setValValor(20);
        MovimentoManual movimentoManual = ObjectMapperUtils.map(createMovimentoManualDTO, MovimentoManual.class);
        movimentoManual.setProdutoCosif(produtoCosif);
        
        ReadMovimentoManualDTO readMovimentoManualDTO = ReadMovimentoManualDTO.build(movimentoManual);
        assertEquals(produto.getCodProduto(), readMovimentoManualDTO.getProduto().getCodProduto());
        assertEquals(produto.getDesProduto(), readMovimentoManualDTO.getProduto().getDesProduto());
        assertEquals(createMovimentoManualDTO.getDatAno(), readMovimentoManualDTO.getDatAno());

    }

    
}
