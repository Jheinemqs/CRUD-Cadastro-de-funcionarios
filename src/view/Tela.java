package view;

import java.util.List;

import bean.FuncionarioBean;
import bo.FuncionarioBO;

public class Tela {

	public void menuPrincipal() {
		System.out.println("============= Cadastro de funcionarios =============");
		System.out.println("1. Cadastrar um funcionario: ");
		System.out.println("2. Listar todos funcionarios ");
		System.out.println("3. Alterar funcionario: ");
		System.out.println("4. Remover um funcionario: ");
		
		System.out.println("5. Sair.");
		System.out.println("----------------------------------------------------");
		System.out.println("Selecione a opção desejada:  ");
	}

	public void cadastrarFuncionario() {
		System.out.println(" Digite o nome do novo funcionario: ");

	}
	public void alterarNomeFunc() {
		System.out.println(" Digite o nome novo do funcionario: ");

	}
	public void listarFuncionarios(FuncionarioBO funcionarioBO) {
		System.out.println("=======================================");
		List<FuncionarioBean> funcList = funcionarioBO.getFuncionarioList();

		for (FuncionarioBean funcionarioBean: funcList) {
			System.out.println("ID: " + funcionarioBean.getId() + " - Nome: " + funcionarioBean.getNome() + " - Setor: " + funcionarioBean.getSetor());
			System.out.println("   ");
		}
	}

	public void alterarFuncionario(FuncionarioBO funcionarioBO) {
		listarFuncionarios(funcionarioBO);
		System.out.println(" Digite o Id funcionario que deseja alterar: ");

	}

	public void definirSetor() {
		System.out.println(" Digite o setor do funcionario: ");

	}

	public void removerFuncionario(FuncionarioBO funcionarioBO) {
		listarFuncionarios(funcionarioBO);
		System.out.println("Escolha o ID do funcionario que deseja remover: ");
		
	}
}
