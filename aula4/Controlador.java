public class Controlador {
    private Usuario modelo;
    private Visao visao;

    public Controlador(Usuario modelo, Visao visao) {
        this.modelo = modelo;
        this.visao = visao;
    }

    public void processarNome() {
        String n = visao.obterNome();
        modelo.setNome(n);
        visao.mostrarMensagem("Olá, " + modelo.getNome() + "!");
    }
}
