
public class Gerente extends Funcionario {
    private int numSubordinados;

    public Gerente(String nome, double salario, int numSubordinados) {
        super(nome, salario, "Gerente");
        this.numSubordinados = numSubordinados;
    }

    public int getNumSubordinados() {
        return numSubordinados;
    }

    public void setNumSubordinados(int numSubordinados) {
        this.numSubordinados = numSubordinados;
    }

    // Implementação do método abstrato calcularBonus()
    public double calcularBonus() {
        return getSalario() * 0.2;
    }

    // Sobrescrita do método toString() para exibir informações de um Gerente
    public String toString() {
        return super.toString() + ", Número de Subordinados: " + numSubordinados;
    }
}
