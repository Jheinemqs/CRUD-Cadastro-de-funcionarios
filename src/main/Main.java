package main;

import java.util.Scanner;

import bo.FuncionarioBO;
import view.Tela;



public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		FuncionarioBO funcionarioBO = new FuncionarioBO();
		Tela tela = new Tela();

		Integer opcao = 0; 

		try {

			while (opcao >= 0 && opcao <= 4) {
				tela.menuPrincipal();
				opcao = sc.nextInt();

				switch (opcao) {
				case 1:
					cadastrarFuncionario(funcionarioBO, tela);
					break;
				case 2:
					tela.listarFuncionarios(funcionarioBO);
					break;
				case 3:
					alterarFuncionario(funcionarioBO, tela);
					break;
				
				case 4:
					removerFuncionario(funcionarioBO, tela);
					break;
					
				case 5:
					
					break; 

				default:
					break;
				}
			}

		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

	private static void removerFuncionario(FuncionarioBO funcionarioBO, Tela tela) {
	funcionarioBO.iniciar();
		
		tela.removerFuncionario(funcionarioBO);
		Integer idRemover = sc.nextInt();
		
		funcionarioBO.remove(idRemover);
	}

	private static void cadastrarFuncionario(FuncionarioBO funcionarioBO, Tela tela){
		funcionarioBO.iniciar();
		
		tela.cadastrarFuncionario();
		String nome = sc.next();
		
		tela.definirSetor();
		String setor = sc.next();
		
		funcionarioBO.definirDados(nome, setor);
	}
	private static void alterarFuncionario(FuncionarioBO funcionarioBO, Tela tela) {
		funcionarioBO.iniciar();
		
		tela.alterarFuncionario(funcionarioBO);
		Integer idSelecionado = sc.nextInt();
		
		tela.alterarNomeFunc();
		String nomeAlterar = sc.next();
		
		tela.definirSetor();
		String setorAlterar = sc.next();
		
		funcionarioBO.alterarDados(idSelecionado, nomeAlterar, setorAlterar);
		
	}

}

