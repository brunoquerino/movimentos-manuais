package br.com.brunoquerino.movimentosmanuais.api.controller;

public class ErroView {
    
    private final String mensagem;

    public ErroView(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
