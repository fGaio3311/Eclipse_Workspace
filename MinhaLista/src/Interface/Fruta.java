package Interface;
public interface Fruta {
    String nome = "";
    String cor = "";
    double peso = 0;

    void estraga();
    void descasca();
    void amadurece(double porct_amadure_novo);
    double getPeso();
    String getCor();
    String getNome();
}
