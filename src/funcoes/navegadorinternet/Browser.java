package funcoes.navegadorinternet;

public class Browser implements NavegadorInternet {

    public void exibirPagina(String url) {
        System.out.println("EXIBINDO" + url);
    }
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO");
    }
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO");
    }        

}
