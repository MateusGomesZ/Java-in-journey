
public class Assistente extends Funcionario {
    private int numProjetos;

    public Assistente(String nome, double salario, int numProjetos) {
        super(nome, salario, "Assistente");
        this.numProjetos = numProjetos;
    }

    public int getNumProjetos() {
        return numProjetos;
    }

    public void setNumProjetos(int numProjetos) {
        this.numProjetos = numProjetos;
    }

    public double calcularBonus() {
        return getSalario() * 0.05 * numProjetos;
    }

    public String toString() {
        return super.toString() + ", Número de Projetos: " + numProjetos;
    }
}
