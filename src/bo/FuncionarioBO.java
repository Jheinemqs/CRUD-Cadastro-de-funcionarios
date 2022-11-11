package bo;

import java.util.ArrayList;
import java.util.List;

import bean.FuncionarioBean;

public class FuncionarioBO {
	private FuncionarioBean funcionarioBean = null;
	private static Integer id = 0;
	static List<FuncionarioBean> funcList = new ArrayList<FuncionarioBean>();

	public void carregarId()  {
		iniciar();
		++id;

	}

	public void iniciar() {
		this.funcionarioBean = new FuncionarioBean();
	}

	public void definirDados(String nome, String setor) {
		iniciar();
		carregarId();

		this.funcionarioBean.setId(id);
		this.funcionarioBean.setNome(nome);
		this.funcionarioBean.setSetor(setor);

		funcList.add(this.funcionarioBean);
	}

	public void alterarDados(Integer id, String nome, String setor) {
		iniciar();
		
		for(FuncionarioBean funcionarioBean : funcList) {
			if (funcionarioBean.getId().equals(id)) {
				funcionarioBean.setNome(nome);
				funcionarioBean.setSetor(setor);
			}
		
		}
		
	}

	public List<FuncionarioBean> getFuncionarioList() {
		return funcList;

	}

	public void remove(Integer id) {
		iniciar();

		for (FuncionarioBean funcionarioBean : funcList) {
			if (funcionarioBean.getId().equals(id)) {
				funcList.remove(funcionarioBean);
			}
		}
	}
}

