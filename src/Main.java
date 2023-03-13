public class Main {
    public static void main(String[] args) {
        // Instanciando um objeto da classe Funcionario
        Funcionario f1 = new Funcionario("João Silva", 2000.0, "Funcionário");

        // Instanciando um objeto da classe Gerente
        Gerente g1 = new Gerente("Maria Souza", 5000.0, "Gerente de Projetos");

        // Instanciando um objeto da classe Assistente
        Assistente a1 = new Assistente("Pedro Santos", 1500.0, 3);

        // Instanciando um objeto da classe Analista

        Analista an1 = new Analista("Mateus Gomes", 3500.0, "Java");

        // Imprimindo as informações dos objetos
        System.out.println(f1.toString());
        System.out.println(g1.toString());
        System.out.println(a1.toString());
        System.out.println(an1.toString());

        // Calculando e imprimindo os bônus dos funcionários
        System.out.println("Bônus de " + f1.getNome() + ": R$" + f1.calcularBonus());
        System.out.println("Bônus de " + g1.getNome() + ": R$" + g1.calcularBonus());
        System.out.println("Bônus de " + a1.getNome() + ": R$" + a1.calcularBonus());
        System.out.println("Bônus de " + an1.getNome() + ": R$" + an1.calcularBonus());
    }
}