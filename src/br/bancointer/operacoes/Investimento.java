package br.bancointer.operacoes;

/*
 * Dica: deixar as classes Default para n�o serem acessadas de fora do pacote.
 * Isso garante a funcionalidade do FACADE.
 */
class Investimento {
	private double tesouroDireto;
	private double poupanca;
	private double previdenciaPrivada;

	/*
	 * N�o irei aplicar as regras de neg�cio reais, pois, a inten��o � fazer com que
	 * a fachada seja utilizada, e n�o um sistema 100% real.
	 */

	public Investimento() {
		super();
	}

	public void inserirValorTesouroDireto(double valor) {
		this.tesouroDireto += valor;
		System.out.println("Parab�ns, voc� investiu R$" + valor + " no tesouro direto, seu saldo atual � de: R$ "
				+ this.tesouroDireto);
	}

	public void sacarValorTesouroDireto(double valor) {
		if (valor > this.tesouroDireto) {
			System.out.println("Voc� n�o possui este saldo, tente novamente.");
		} else {
			this.tesouroDireto -= valor;
			System.out.println("Voc� sacou um valor de R$ " + valor + " no tesouro direto, seu saldo atual � de R$ "
					+ this.tesouroDireto);
		}
	}

	public void inserirValorPoupanca(double valor) {
		this.poupanca += valor;
		System.out.println(
				"Parab�ns, voc� investiu R$" + valor + " na poupan�a, seu saldo atual � de: R$ " + this.poupanca);
	}

	public void sacarValorPoupanca(double valor) {
		if (valor > this.poupanca) {
			System.out.println("Voc� n�o possui este saldo, tente novamente.");
		} else {
			this.poupanca -= valor;
			System.out.println(
					"Voc� sacou um valor de R$ " + valor + " na poupan�a, seu saldo atual � de R$ " + this.poupanca);
		}
	}

	public void inserirValorPrevidencia(double valor) {
		this.previdenciaPrivada += valor;
		System.out.println("Parab�ns, voc� investiu R$" + valor + " na previd�ncia privada, seu saldo atual � de: R$ "
				+ this.previdenciaPrivada);
	}

	public void sacarValorPrevidencia(double valor) {
		if (valor > this.previdenciaPrivada) {
			System.out.println("Voc� n�o possui este saldo, tente novamente.");
		} else {
			this.previdenciaPrivada -= valor;
			System.out.println("Voc� sacou um valor de R$ " + valor + " da previdenciaPrivada, seu saldo atual � de R$ "
					+ this.previdenciaPrivada);
		}
	}

}
