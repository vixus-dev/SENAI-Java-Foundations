package com.vixus.inc;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Jogo extends JFrame {

    public  int money = 0;
    public  int multiplicador = 1;
    public  int cost1 = 50,cost2 = 125,cost3 = 200;
    public int Compras1,Compras2,Compras3;

    private JLabel moneyLabel;
    private JLabel multiplicadorLabel;

    public Jogo() {
        setTitle("Jogo Clicker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        createMenu(); // 🔥 Menu de salvar/carregar

        // Criação das abas
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel clickPanel = createClickPanel();
        JPanel shopPanel = createShopPanel();
        
        tabbedPane.addTab("Clique", clickPanel);
        tabbedPane.addTab("Loja", shopPanel);

        add(tabbedPane);
        setVisible(true);
    }

    // 🔥 Aba de clique
    private JPanel createClickPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Label de dinheiro no topo
        moneyLabel = new JLabel("Dinheiro: " + money, SwingConstants.CENTER);
        moneyLabel.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(moneyLabel, BorderLayout.NORTH);

        // Botão central
        JButton clickButton = new JButton("Clique para ganhar dinheiro!");
        clickButton.setFont(new Font("Arial", Font.BOLD, 18));
        clickButton.addActionListener(e -> {
        	money += 1 * multiplicador;
            updateLabels();
        });

        panel.add(clickButton, BorderLayout.CENTER);

        return panel;
    }

    // 🔥 Aba da loja
    private JPanel createShopPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Label do multiplicador
        multiplicadorLabel = new JLabel("Multiplicador: " + multiplicador, SwingConstants.CENTER);
        multiplicadorLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(multiplicadorLabel, BorderLayout.NORTH);

        // Painel de itens da loja
        JPanel shopItemsPanel = new JPanel();
        shopItemsPanel.setLayout(new GridLayout(3, 1, 10, 10));

        // Item 1
        JButton item1 = new JButton();
        item1.setText("Comprar +1x clique (Custa "+cost1+")");
        item1.addActionListener(e -> buyItem(cost1, 1));


        // Item 2
        JButton item2 = new JButton();
        item2.setText("Comprar +3x clique (Custa "+ cost2 +")");
        item2.addActionListener(e -> buyItem2(cost2, 3));
       

        // Item 3
        JButton item3 = new JButton();
        item3.setText("Comprar +5x clique (Custa "+ cost3 +")");
        item3.addActionListener(e -> buyItem3(cost3, 5));

        shopItemsPanel.add(item1);
        shopItemsPanel.add(item2);
        shopItemsPanel.add(item3);

        panel.add(shopItemsPanel, BorderLayout.CENTER);

        return panel;
    }

    // 🔧 Comprar item
    private void buyItem(int cost, int multiplierIncrease) {
        if (money >= cost) {
            money -= cost;
            multiplicador += multiplierIncrease;
            Compras1 ++;
            updateLabels();
        } else {
            JOptionPane.showMessageDialog(this, "Dinheiro insuficiente!");
        }
    }
    private void buyItem2(int cost, int multiplierIncrease) {
        if (money >= cost) {
            money -= cost;
            multiplicador += multiplierIncrease;
            Compras2++;
            updateLabels();
        } else {
            JOptionPane.showMessageDialog(this, "Dinheiro insuficiente!");
        }
    }
    private void buyItem3(int cost, int multiplierIncrease) {
        if (money >= cost) {
            money -= cost;
            multiplicador += multiplierIncrease;
            Compras3 ++;
            updateLabels();
        } else {
            JOptionPane.showMessageDialog(this, "Dinheiro insuficiente!");
        }
    }

    // Atualizar labels
    private void updateLabels() {
        moneyLabel.setText("Dinheiro: " + money);
        multiplicadorLabel.setText("Multiplicador: " + multiplicador);
        cost1 = cost1 + 25*Compras1;
        cost2 = cost2 + 50*Compras2;
        cost3 = cost3 + 100*Compras2;
        
    }

    // Salvar o jogo
    private void saveGame() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("savegame.txt"))) {
            writer.println(money);
            writer.println(multiplicador);
            JOptionPane.showMessageDialog(this, "Jogo salvo com sucesso!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar o jogo.");
            e.printStackTrace();
        }
    }
    private void dobrarDinheiro() {
    	money = money*2;
    	updateLabels();
    }

    // Carregar o jogo
    private void loadGame() {
        try (BufferedReader reader = new BufferedReader(new FileReader("savegame.txt"))) {
            money = Integer.parseInt(reader.readLine());
            multiplicador = Integer.parseInt(reader.readLine());
            updateLabels();
            JOptionPane.showMessageDialog(this, "Jogo carregado com sucesso!");
        } catch (IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar o jogo.");
            e.printStackTrace();
        }
    }

    // Menu de salvar e carregar
    private void createMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu gameMenu = new JMenu("Jogo");
        JMenuItem saveItem = new JMenuItem("Salvar");
        JMenuItem loadItem = new JMenuItem("Carregar");
        JMenuItem dobrarDinheiro = new JMenuItem("Dobrar dinheiro");

        saveItem.addActionListener(e -> saveGame());
        loadItem.addActionListener(e -> loadGame());
        dobrarDinheiro.addActionListener(e -> dobrarDinheiro());

        gameMenu.add(saveItem);
        gameMenu.add(loadItem);
        gameMenu.add(dobrarDinheiro);

        menuBar.add(gameMenu);
        setJMenuBar(menuBar);
    }

    // 🚀 Main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Jogo::new);
    }
}

