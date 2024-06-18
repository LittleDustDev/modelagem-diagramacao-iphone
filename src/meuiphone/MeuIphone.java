package meuiphone;

import funcoes.aparelhotelefonico.AparelhoTelefonico;
import funcoes.navegadorinternet.NavegadorInternet;
import funcoes.reprodutormusical.ReprodutorMusical;
import iphone.IPhone;

public class MeuIphone {
    public static void main(String[] args) {

    AparelhoTelefonico aparelho = new IPhone();
    aparelho.ligar(123456);
    aparelho.atender();
    aparelho.iniciarCorreioVoz();

    NavegadorInternet internet = new IPhone();
    internet.exibirPagina("www.google.com");
    internet.atualizarPagina();
    internet.adicionarNovaAba();
    
    ReprodutorMusical reprodutor = new IPhone();
    reprodutor.selecionarMusica("Crystal Castles - Kerosene");
    reprodutor.tocar();
    reprodutor.pausar();

    }    
}
