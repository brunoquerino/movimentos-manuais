/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.brunoquerino.movimentosmanuais.exception;


public class ProdutoNotFoundException extends RuntimeException{
    public ProdutoNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProdutoNotFoundException(String message) {
        super(message);
    }
}
