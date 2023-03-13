//Classe FILHA ANALISTA
public class Analista extends Funcionario {
    private String tecnologia;

    public Analista(String nome, double salario, String tecnologia) {
        super(nome, salario, "Analista");
        this.tecnologia = tecnologia;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    // Implementação do método abstrato calcularBonus()
    public double calcularBonus() {
        return getSalario() * 0.1;
    }

    // Sobrescrita do método toString() para exibir informações de um Analista
    public String toString() {
        return super.toString() + ", Tecnologia: " + tecnologia;
    }
}