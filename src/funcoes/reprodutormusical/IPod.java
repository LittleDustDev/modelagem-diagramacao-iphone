package funcoes.reprodutormusical;

public class IPod implements ReprodutorMusical {

    public void tocar() {
        System.out.println("TOCANDO");
    }
    public void pausar() {
        System.out.println("PAUSADO");
    }
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO" + musica);
    } 

}
