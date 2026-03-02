package Exercício_6;

import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {
    	
        // criando a arraylist
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        
        // Criando os Funcionarios
        Gerente gerente = new Gerente("Vitinho", 1, 10000.0, 1500.0);
        Desenvolvedor dev1 = new Desenvolvedor("Ronaldo", 2, 7500.0, new String[]{"Java", "SQL"});
        Desenvolvedor dev2 = new Desenvolvedor("Nego ney", 3, 2000.0, new String[]{"Python"});
        
        // adicionando os funcionarios a lista
        funcionarios.add(gerente);
        funcionarios.add(dev1);
        funcionarios.add(dev2);

        System.out.println("Folha de Pagamento:");
        // Usna
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome() + ", Salario total: " + f.calcularSalario());
        }
    }
}
