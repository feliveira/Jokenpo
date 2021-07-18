package jokenpo;

import java.util.Scanner;

public class Logica{

	public static void contraJogador(Scanner sc) {
		String jogador1 = "", jogador2 = "";
		
		System.out.println("\n===== Jogador x Jogador =====");
		System.out.println("\nVez do Jogador 1\n");
		
		while(!(validarEscolha(jogador1))) {
			menuOpcoes();
			jogador1 = sc.next();
		}
		
		jogador1 = escolhaJogador(jogador1);
		
		System.out.println("\nVez do Jogador 2\n");
		
		while(!(validarEscolha(jogador2))) {
			menuOpcoes();
			jogador2 = sc.next();
		}
		jogador2 = escolhaJogador(jogador2);
		
		String vencedor = decidirVencedor(jogador1, jogador2);
		
		System.out.println("A escolha do Jogador 1 foi: " + jogador1);
		System.out.println("A escolha do Jogador 2 foi: " + jogador2);

		if(vencedor == "Empate") {
			System.out.println("\nO jogo resultou em Empate\n\n");
		}
		else if(jogador1.equals(vencedor)) {
			System.out.println("\nO Jogador 1 ganhou!\n\n");
		}
		else {
			System.out.println("\nO Jogador 1 ganhou!\n\n");
		}
			
	}

	public static void contraComputador(Scanner sc) {
		String jogador = "";
		String computador;
		
		System.out.println("\n===== Jogador x Computador =====\n");
		System.out.println("Vez do jogador");
		
		while(!(validarEscolha(jogador))) {
			menuOpcoes();
			jogador = sc.next();
		}
		
		jogador = escolhaJogador(jogador);

		computador = escolhaComputador();
		
		String vencedor = decidirVencedor(jogador, computador);
		
		System.out.println("A escolha do Jogador foi: " + jogador);
		
		System.out.println("A escolha do Computador foi: " + computador);

		
		if(vencedor == "Empate") {
			System.out.println("\nO jogo resultou em Empate\n\n");
		}
		else if(jogador.equals(vencedor)) {
			System.out.println("\nO jogador ganhou!\n\n");
		}
		else {
			System.out.println("\nO computador ganhou!\n\n");
		}
		
	}
	
	public static void menuOpcoes() {
		System.out.println("Escolha uma opção: "+
						   "\n1 - Pedra" +
						   "\n2 - Papel" + 
						   "\n3 - Tesoura");
	}
	
	public static boolean validarEscolha(String escolha) {
		
		boolean ehValida = false;
		
		String numeros[] = {"1","2","3"};
		boolean numeroValido = false;
		
		String palavras[] = {"Pedra", "Papel", "Tesoura"};
		boolean palavraValida = false;
		
		for(String opcao : numeros) {
			if(opcao.equals(escolha)) {
				numeroValido = true;
			}
		}
		
		for(String opcao : palavras) {
			if(opcao.equalsIgnoreCase(escolha)) {
				palavraValida = true;
			}
		}
		
		if(numeroValido || palavraValida) {
			ehValida = true;
		}
		
		return ehValida;
	}
	
	public static String escolhaJogador(String escolha) {

		if(escolha.equals("1") || escolha.equalsIgnoreCase("Pedra")) {
			escolha = "Pedra";
		}
		else if (escolha.equals("2") || escolha.equalsIgnoreCase("Papel")) {
			escolha = "Papel";
		}
		else {
			escolha = "Tesoura";
		}
		
		return escolha;
	}
	
	public static String escolhaComputador() {
		int numero = (int) (Math.random() * 31);
		String escolha = "";
		if(numero <= 10) {
			escolha = "Pedra";
		}
		else if (numero <= 20) {
			escolha = "Papel";
		}
		else {
			escolha = "Tesoura";
		}
		
		return escolha;	
	}
	
	public static String decidirVencedor(String jogador1, String jogador2) {
		String vencedor;
		if(jogador1.equals(jogador2)) {
			vencedor = "Empate";
		}
		else if(jogador1.equals("Pedra") && jogador2.equals("Tesoura") || jogador1.equals("Papel") && jogador2.equals("Pedra") || jogador1.equals("Tesoura") && jogador2.equals("Papel")) {
			vencedor = jogador1;
		}
		else {
			vencedor = jogador2;
		}
		
		return vencedor;
		
	}
	
}
