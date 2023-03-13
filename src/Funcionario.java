public abstract class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    // Métodos get e set para os atributos encapsulados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Método abstrato para calcular o bônus de um funcionário
    public abstract double calcularBonus();

    // Método toString para exibir informações de um funcionário
    public String toString() {
        return "Nome: " + nome + ", Salário: " + salario + ", Cargo: " + cargo;
    }
}
