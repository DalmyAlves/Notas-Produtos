import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        double valor;
        int quantidade;

        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i <= 1; i++){

            System.out.print("Digite o Nome do Seu Produto: ");
            nome = entrada.nextLine();

            System.out.print("Digite o Valor do Seu Produto: ");
            valor = entrada.nextDouble();

            System.out.print("Digite a Quantidade do Seu Produto: ");
            quantidade = entrada.nextInt();

            Produto produto = new Produto(nome, quantidade, valor);

            produto.exibirDetalhes();
            entrada.nextLine();
        }
        entrada.close();
    }
}