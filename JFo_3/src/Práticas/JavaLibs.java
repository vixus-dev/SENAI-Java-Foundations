package Práticas;

import javax.swing.JOptionPane;

public class JavaLibs {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        String cidade = JOptionPane.showInputDialog("Digite o nome de uma cidade:");
        String animal = JOptionPane.showInputDialog("Digite seu animal favorito:");
        String cor = JOptionPane.showInputDialog("Digite uma cor:");
        String hobby = JOptionPane.showInputDialog("Digite um hobby:");
        String comida = JOptionPane.showInputDialog("Digite sua comida favorita:");
        String adjetivo = JOptionPane.showInputDialog("Digite um adjetivo:");
        String substantivo = JOptionPane.showInputDialog("Digite um substantivo:");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade (número inteiro):"));
        double dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor em dinheiro (número com vírgula):"));

        int idadeFutura = idade + 5;
        double dinheiroDobrado = dinheiro * 2;

        String historia = "Era uma vez em " + cidade + ", uma pessoa chamada " + nome + ".\n"
                + nome + " adorava " + animal + "s e sempre usava um chapéu " + cor + ".\n"
                + "Todos os dias, " + nome + " passava o tempo " + hobby + " e comendo " + comida + ".\n"
                + "Um dia, um(a) " + adjetivo + " " + substantivo + " apareceu e ofereceu um desafio para " + nome + ".\n"
                + "Se " + nome + " resolvesse o enigma, ganharia R$" + dinheiro + ".\n"
                + nome + " tinha " + idade + " anos, mas sentia que podia fazer qualquer coisa!\n"
                + "Depois de 5 anos, " + nome + " teria " + idadeFutura + " anos e R$" + dinheiroDobrado + ".\n"
                + "E assim, a aventura começou...";

        JOptionPane.showMessageDialog(null, historia);
    }
}
