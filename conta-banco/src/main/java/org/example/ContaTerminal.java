package org.example;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner inputUsuario = new Scanner(System.in);

        System.out.println("Digite o número do cliente:");
        int numeroCliente = inputUsuario.nextInt();
        inputUsuario.nextLine();

        System.out.println("Digite o número da agência:");
        String numeroAgencia = inputUsuario.nextLine();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = inputUsuario.nextLine();

        System.out.println("Digite o Saldo:");
        float numeroSaldo = inputUsuario.nextFloat();

        String dadosConta = "Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroAgencia + " conta " + numeroCliente + " e seu saldo " + numeroSaldo + " Já está disponivel para saque.";

        //Exibir os dados inseridos
        System.out.println(dadosConta);
    }
}