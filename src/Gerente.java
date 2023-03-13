
public class Gerente extends Funcionario {
    private String area;

    public Gerente(String nome, double salario, String area) {
        super(nome, salario, "Gerente");
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double calcularBonus() {
        return getSalario() * 0.1;
    }

    public String toString() {
        return super.toString() + ", Área: " + area;
    }
}
