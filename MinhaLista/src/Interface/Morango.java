package Interface;
public class Morango {
    private String nome = "Morango";
    private String cor = "Vermelho";
    private double peso;
    private boolean estaNoChao;
    private boolean estaLavado;

    public Morango(double peso, boolean estaNoChao, boolean estaLavado) {
        this.peso = peso;
        this.estaNoChao = estaNoChao;
        this.estaLavado = estaLavado;

    }

    public void estraga() {
        if (estaNoChao || !estaLavado){
            System.out.println("\nEstragou!\n");
        }
    }

    public void descasca() {
        System.out.println("\nhaha!Não se descasca Morango! \n");
    }

    public void amadurece(double porct_amadure_novo) {

    }

    public double getPeso() {
        return this.peso;
    }

    public String getCor() {
        return this.cor;
    }

    public String getNome() {
        return this.nome;
    }
}
