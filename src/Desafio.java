import java.util.Scanner;

public class Desafio {
    public static void main (String[]args){
        String nome = "Leo barros";
        String tipoConta = "Conta corrente";
        double saldo = 1200;
        int opcao = 0 ;




        System.out.println("********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo da Atual: " + saldo);
        System.out.println("\n*******************");

        String menu = """
                Digite sua opcao :
                1 - Consultar saldo 
                2 - Transeferir valor
                3 - Receber valor
                4 - Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();
            if (opcao == 1){
                System.out.println("Saldo da conta: " + saldo);
                opcao = leitura.nextInt();
            } else if (opcao == 2) {
                System.out.println("Qual a quantidade que deseja transferir: ");
                double valor = leitura.nextDouble();
                if (valor > saldo){
                    System.out.println("Uma pena voce nao tem esse valor para transferir!");
                }else {
                    saldo = saldo - valor;
                    System.out.println("Saldo Atualizado: " + saldo);
                }

            }else if(opcao == 3){
                System.out.println("Digite o valor que voce esta recebendo: ");
                double valorRecebido = leitura.nextDouble();
                saldo = saldo + valorRecebido;
                System.out.println("Saldo atualizado! " + saldo);
            } else if (opcao != 4) {
                System.out.println("Valor incorreto, colsulte o menu para realizar a operacao!");
            }
        }
    }
}
