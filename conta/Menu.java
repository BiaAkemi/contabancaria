package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import conta.model.Conta;
import conta.util.Cores;
import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {
		
		/*
		// Teste da Classe Conta corrente
		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Mariana", 15000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		// Teste da Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 2, "Victor", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar(); */
		
		Scanner leia = new Scanner(System.in);
		
		int op;
		
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
			                 + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			try {
				op = leia.nextInt();
			} catch(InputMismatchException inputMismatchException) {
				System.out.println("\nDigite valores inteiro!");
				leia.nextLine();
				op = 0;
			}
			
			if (op == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);	
			}
			
			switch (op) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Criar Conta \n\n");
				
				keyPress();
				break;
				
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Listar todas as Contas \n\n");
				
				keyPress();
				break;
				
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Consultar dados da Conta - por número\n\n");
				
				keyPress();
				break;
				
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Atualizar dados da Conta\n\n");
				
				keyPress();
				break;
				
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Apagar a Conta\n\n");
				
				keyPress();
				break;
				
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Saque\n\n");
				
				keyPress();
				break;
				
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Depósito\n\n");
				
				keyPress();
				break;
				
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD + "Transferência entre Contas\n\n");
				
				keyPress();
				break;
				
			default:
				System.out.println(Cores.TEXT_RED_BOLD+"\nOpção Inválida!\n");
				
				keyPress();
				break;
			}
		}	
	}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Bianca Akemi - beancaakemi@gmail.com");
		System.out.println("https://github.com/BiaAkemi");
		System.out.println("Em parceria com © Generation Brasil");
		System.out.println("*********************************************************");
	}
	
	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException iOException) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}

