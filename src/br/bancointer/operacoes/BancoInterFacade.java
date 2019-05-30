package br.bancointer.operacoes;
/*
 * CLASSE DE FACHADA, D� ACESSO A TODAS AS CLASSES DO PACOTE.
 * �NICA CLASSE VIS�VEL AO CLIENTE.
 */
public class BancoInterFacade {
	private Investimento invest;
	private Emprestimo emprestimo;
	

	public BancoInterFacade() {
		super();
		this.invest = new Investimento();
		this.emprestimo = new Emprestimo();
	}

	/*
	 * M�TODOS DE INVESTIMENTO - FACADE APLICADO.
	 */
	public void aplicarTD(double valor) {
		invest.inserirValorTesouroDireto(valor);
	}

	public void sacarTD(double valor) {
		invest.sacarValorTesouroDireto(valor);
	}

	public void aplicarPoupanca(double valor) {
		invest.inserirValorPoupanca(valor);
	}

	public void sacarPoupanca(double valor) {
		invest.sacarValorPoupanca(valor);
	}

	public void aplicarPrevidencia(double valor) {
		invest.inserirValorPrevidencia(valor);
	}

	public void sacarPrevidencia(double valor) {
		invest.sacarValorPrevidencia(valor);
	}
	
	/*
	 * M�TODOS DE EMPRESTIMO - FACADE APLICADO.
	 */
	
	public void solicitarEmprestimo(String cpf, double valor) {
		emprestimo.solicitarEmprestimo(cpf, valor);
	}

}
