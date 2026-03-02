package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class DashboardExemplo extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 1. ESTRUTURA PRINCIPAL (LAYOUT)
        BorderPane root = new BorderPane();
        root.setStyle("-fx-background-color: #F0F2F5;"); // Um cinza bem claro

        // 2. PAINEL SUPERIOR (CABEÇALHO)
        HBox topPane = new HBox();
        topPane.setPadding(new Insets(20));
        topPane.setStyle("-fx-background-color: #FFFFFF; -fx-border-width: 0 0 1 0; -fx-border-color: #E0E0E0;");
        Label titleLabel = new Label("Dashboard de Vendas");
        titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        titleLabel.setTextFill(Color.web("#333333"));
        topPane.getChildren().add(titleLabel);
        root.setTop(topPane);

        // 3. MENU LATERAL (NAVEGAÇÃO)
        VBox leftMenu = new VBox(10);
        leftMenu.setPadding(new Insets(20));
        leftMenu.setSpacing(15);
        leftMenu.setStyle("-fx-background-color: #FFFFFF; -fx-border-width: 0 1 0 0; -fx-border-color: #E0E0E0;");
        String[] menuItems = {"Dashboard", "Relatórios", "Clientes", "Produtos", "Configurações"};
        for (String item : menuItems) {
            Label menuItemLabel = new Label(item);
            menuItemLabel.setFont(Font.font("Arial", FontWeight.MEDIUM, 16));
            menuItemLabel.setTextFill(Color.web("#555555"));
            // Destaca o item ativo
            if (item.equals("Dashboard")) {
                menuItemLabel.setStyle("-fx-font-weight: bold; -fx-text-fill: #007BFF;");
            }
            leftMenu.getChildren().add(menuItemLabel);
        }
        root.setLeft(leftMenu);

        // 4. CONTEÚDO CENTRAL (GRÁFICOS E DADOS)
        GridPane mainGrid = new GridPane();
        mainGrid.setPadding(new Insets(20));
        mainGrid.setHgap(20);
        mainGrid.setVgap(20);
        
        // Cards de KPIs
        VBox kpiVendas = createKpiCard("Vendas Totais", "R$ 152.789,50", "#28A745");
        VBox kpiClientes = createKpiCard("Novos Clientes", "215", "#17A2B8");
        VBox kpiPedidos = createKpiCard("Pedidos Hoje", "42", "#FFC107");

        mainGrid.add(kpiVendas, 0, 0);
        mainGrid.add(kpiClientes, 1, 0);
        mainGrid.add(kpiPedidos, 2, 0);

        // Gráfico de Pizza: Vendas por Categoria
        PieChart pieChart = createPieChart();
        mainGrid.add(pieChart, 0, 1);

        // Gráfico de Barras: Vendas Mensais
        BarChart<String, Number> barChart = createBarChart();
        mainGrid.add(barChart, 1, 1, 2, 1); // Ocupa 2 colunas

        // Tabela de Vendas Recentes
        TableView<Venda> tableView = createTableView();
        mainGrid.add(tableView, 0, 2, 3, 1); // Ocupa 3 colunas

        root.setCenter(mainGrid);

        // 5. CONFIGURAÇÃO DA CENA E EXIBIÇÃO
        Scene scene = new Scene(root, 1280, 800);
        primaryStage.setTitle("Exemplo de Dashboard JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Método auxiliar para criar um card de KPI
    private VBox createKpiCard(String titulo, String valor, String corValor) {
        VBox card = new VBox(5);
        card.setPadding(new Insets(15));
        card.setAlignment(Pos.CENTER_LEFT);
        card.setStyle("-fx-background-color: white; -fx-background-radius: 8; -fx-effect: dropshadow(gaussian, rgba(0,0,0,0.1), 10, 0.5, 0, 0);");

        Label labelTitulo = new Label(titulo);
        labelTitulo.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        labelTitulo.setTextFill(Color.web("#666666"));

        Label labelValor = new Label(valor);
        labelValor.setFont(Font.font("Arial", FontWeight.BOLD, 28));
        labelValor.setTextFill(Color.web(corValor));

        card.getChildren().addAll(labelTitulo, labelValor);
        return card;
    }

    // Método auxiliar para criar o Gráfico de Pizza
    private PieChart createPieChart() {
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Eletrônicos", 45),
                        new PieChart.Data("Livros", 20),
                        new PieChart.Data("Vestuário", 25),
                        new PieChart.Data("Casa & Cozinha", 10));
        PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Vendas por Categoria");
        chart.setLegendVisible(true);
        chart.setStyle("-fx-font-size: 12px;");
        return chart;
    }

    // Método auxiliar para criar o Gráfico de Barras
    private BarChart<String, Number> createBarChart() {
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String, Number> bc = new BarChart<>(xAxis, yAxis);
        
        bc.setTitle("Vendas Mensais (últimos 6 meses)");
        xAxis.setLabel("Mês");
        yAxis.setLabel("Valor (R$)");

        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName("2025");
        series1.getData().add(new XYChart.Data<>("Fevereiro", 21000));
        series1.getData().add(new XYChart.Data<>("Março", 29000));
        series1.getData().add(new XYChart.Data<>("Abril", 32000));
        series1.getData().add(new XYChart.Data<>("Maio", 27000));
        series1.getData().add(new XYChart.Data<>("Junho", 35000));
        series1.getData().add(new XYChart.Data<>("Julho", 41000));

        bc.getData().add(series1);
        bc.setLegendVisible(false);
        return bc;
    }

    // Método auxiliar para criar a Tabela de Vendas
    private TableView<Venda> createTableView() {
        TableView<Venda> table = new TableView<>();
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        TableColumn<Venda, Integer> idCol = new TableColumn<>("ID Pedido");
        idCol.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Venda, String> produtoCol = new TableColumn<>("Produto");
        produtoCol.setCellValueFactory(new PropertyValueFactory<>("produto"));

        TableColumn<Venda, String> clienteCol = new TableColumn<>("Cliente");
        clienteCol.setCellValueFactory(new PropertyValueFactory<>("cliente"));

        TableColumn<Venda, Double> valorCol = new TableColumn<>("Valor (R$)");
        valorCol.setCellValueFactory(new PropertyValueFactory<>("valor"));

        TableColumn<Venda, String> statusCol = new TableColumn<>("Status");
        statusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        table.getColumns().addAll(idCol, produtoCol, clienteCol, valorCol, statusCol);

        ObservableList<Venda> data = FXCollections.observableArrayList(
                new Venda(10521, "Notebook Gamer XYZ", "Ana Silva", 6800.00, "Enviado"),
                new Venda(10522, "Monitor 4K 27\"", "Bruno Costa", 2150.50, "Processando"),
                new Venda(10523, "Teclado Mecânico RGB", "Carlos Souza", 450.00, "Entregue"),
                new Venda(10524, "Mouse sem Fio", "Daniela Lima", 189.90, "Enviado"),
                new Venda(10525, "Cadeira Gamer Pro", "Eduardo Martins", 1250.00, "Cancelado")
        );
        table.setItems(data);
        return table;
    }

    // Classe de modelo para os dados da tabela
    public static class Venda {
        private final int id;
        private final String produto;
        private final String cliente;
        private final double valor;
        private final String status;

        public Venda(int id, String produto, String cliente, double valor, String status) {
            this.id = id;
            this.produto = produto;
            this.cliente = cliente;
            this.valor = valor;
            this.status = status;
        }

        // Getters são necessários para PropertyValueFactory funcionar
        public int getId() { return id; }
        public String getProduto() { return produto; }
        public String getCliente() { return cliente; }
        public double getValor() { return valor; }
        public String getStatus() { return status; }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

