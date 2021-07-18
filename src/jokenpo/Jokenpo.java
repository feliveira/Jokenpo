package jokenpo;
import java.util.Scanner;

public class Jokenpo {
	public static void main(String[] args) {
		String opcao = "";
		Scanner sc = new Scanner(System.in);
		
		while(opcao != "3") {
			System.out.println("====== Pedra, Papel ou Tesoura ======"
					+ "\n1 - Jogador x Computador"
					+ "\n2 - Jogador x Jogador"
					+ "\n3 - Sair"
					+ "\nEscolha uma opção:"
					);
			opcao = sc.next();
			
			switch(opcao) {
				case "1":
					Logica.contraComputador(sc);
					break;
				case "2":
					Logica.contraJogador(sc);
					break;
				case "3":
					System.out.println("Obrigado por jogar!");
					System.exit(0);
				default:
					System.out.println("\nPor favor, escolha uma opção válida\n");
					break;
			}			
		}
		sc.close();
	}
	
	
}
