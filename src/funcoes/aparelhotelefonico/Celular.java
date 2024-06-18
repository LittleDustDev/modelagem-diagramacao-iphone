package funcoes.aparelhotelefonico;

public class Celular implements AparelhoTelefonico {

    public void ligar(int numero) {
        System.out.println("LIGANDO PARA" + numero);
    }
    public void atender() {
        System.out.println("ATENDENDO");
    }
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO");
    } 
           
}
