public class Main {
    public static void main(String[] args) {
        String nome = "Rafaela Reis";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("*************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("tipo conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n*************************");
    }
}
String menu = """
                ** Digite sua opção **
                1 - Consultar seu saldo
                2 - Transferir valor
                3 - receber valor
                4 - sair
                """;

        Scanner leitura = new Scanner(System.in);

        while ( opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("-> O seu saldo atual é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("-> Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("-> Seu saldo é insuficiente para completar a transferência");
                } else {
                    saldo = saldo - valor; // poderia ser colocado saldo -= valor. Só para não ficar feio o código
                    System.out.println("-> O valor foi transferido, e seu saldo atualizado é de: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("-> Valor a ser recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("-> Seu saldo atualizado é de: " + saldo);
            } else if (opcao != 4) {
                System.out.println("-> Essa opção não existe!!");
            } else {
                System.out.println("Obrigado por usar nosso Banco Virtual! :)");
            }
        }
    }
}
