import java.util.Scanner;

public class Produto {
    String nomeProduto;
    int quantidade;
    double preco;
    Scanner entrada = new Scanner(System.in);

    public Produto(String nomeProduto, int quantidade, double preco){
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.preco = preco;
    }



    public void exibirDetalhes() {
        double total = calcularTotal(preco, quantidade);
        System.out.println("--------Produto---------");
        System.out.println("Nome: " + nomeProduto + "Preço: " + preco + " Quantidade: " + quantidade + "Valor Total: " + total);
        System.out.println("------------------------");
    }

    public double calcularTotal(double preco, int quantidade){
        double valorTotal = preco  *  quantidade;
        return valorTotal;
    }
}

