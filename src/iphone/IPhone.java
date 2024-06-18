package iphone;

import funcoes.aparelhotelefonico.AparelhoTelefonico;
import funcoes.navegadorinternet.NavegadorInternet;
import funcoes.reprodutormusical.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    int numero;
    
    public void ligar(int numero) {
        System.out.println("LIGANDO VIA INTERFACE CELULAR");
    }
    public void atender() {
        System.out.println("ATENDENDO VIA INTERFACE CELULAR");
    }
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ VIA INTERFACE CELULAR");
    }
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA VIA INTERFACE BROWSER");
    }
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO ABA VIA INTERFACE BROWSER");
    }
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA VIA INTERFACE BROWSER");
    }         
    public void tocar() {
        System.out.println("TOCANDO MUSICA VIA INTERFACE IPOD");
    }
    public void pausar() {
        System.out.println("PAUSANDO MUSICA VIA INTERFACE IPOD");
    }
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MUSICA VIA INTERFACE IPOD");
    } 
            
} 
