package Interface;
public class Banana implements Fruta {
    private static String nome = "Banana";
    private static String cor = "Amarela";
    private double porctAmadure; //porcentagem do amadurecimento 0 - 100 (%)
    private double peso;
    private boolean podre; // true se está podre, false caso contrário.
    private boolean casca; //true se tem casca, false se não tem.

    public Banana (double peso, double porct_amadure, boolean casca) {
        this.peso = peso;
        this.porct_amadure = porct_amadure;

        if (this.porct_amadure >= 0.80F) this.podre = true;
        else this.podre = false;

        this.casca = casca;
    }
    public void estraga() {
        if (this.porct_amadure >= 0.80F) this.podre = true;
        else this.podre = false;
    }
    public void descasca() {
        if (this.casca == true) {
            this.casca = false;
            System.out.println("\nCasca tirada!\n");
        }

        else {
            System.out.println("\nA casca já foi tirada!\n");
        }
    }
    public void amadurece(double porct_amadure_novo) {
        System.out.println("\nAmadurecendo\n");
        if (porct_amadure_novo + this.porct_amadure < 1) {
            System.out.println("\nAmadurecendo\n");
            this.porct_amadure += porct_amadure_novo;

            this.estraga();
        }

        else {
            System.out.println("\nAmadureceu demais!\n");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public String getCor() {
        return this.cor;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getPorctAmadure() {
        return this.porct_amadure;
    }

    public void estaPodre() {
        if (this.podre) System.out.println("\nEstá podre\n");
    }


}
