package br.bancointer.operacoes;

/*
 * Dica: deixar as classes Default para não serem acessadas de fora do pacote.
 * Isso garante a funcionalidade do FACADE.
 */
class Investimento {
	private double tesouroDireto;
	private double poupanca;
	private double previdenciaPrivada;

	/*
	 * Não irei aplicar as regras de negócio reais, pois, a intenção é fazer com que
	 * a fachada seja utilizada, e não um sistema 100% real.
	 */

	public Investimento() {
		super();
	}

	public void inserirValorTesouroDireto(double valor) {
		this.tesouroDireto += valor;
		System.out.println("Parabéns, você investiu R$" + valor + " no tesouro direto, seu saldo atual é de: R$ "
				+ this.tesouroDireto);
	}

	public void sacarValorTesouroDireto(double valor) {
		if (valor > this.tesouroDireto) {
			System.out.println("Você não possui este saldo, tente novamente.");
		} else {
			this.tesouroDireto -= valor;
			System.out.println("Você sacou um valor de R$ " + valor + " no tesouro direto, seu saldo atual é de R$ "
					+ this.tesouroDireto);
		}
	}

	public void inserirValorPoupanca(double valor) {
		this.poupanca += valor;
		System.out.println(
				"Parabéns, você investiu R$" + valor + " na poupança, seu saldo atual é de: R$ " + this.poupanca);
	}

	public void sacarValorPoupanca(double valor) {
		if (valor > this.poupanca) {
			System.out.println("Você não possui este saldo, tente novamente.");
		} else {
			this.poupanca -= valor;
			System.out.println(
					"Você sacou um valor de R$ " + valor + " na poupança, seu saldo atual é de R$ " + this.poupanca);
		}
	}

	public void inserirValorPrevidencia(double valor) {
		this.previdenciaPrivada += valor;
		System.out.println("Parabéns, você investiu R$" + valor + " na previdência privada, seu saldo atual é de: R$ "
				+ this.previdenciaPrivada);
	}

	public void sacarValorPrevidencia(double valor) {
		if (valor > this.previdenciaPrivada) {
			System.out.println("Você não possui este saldo, tente novamente.");
		} else {
			this.previdenciaPrivada -= valor;
			System.out.println("Você sacou um valor de R$ " + valor + " da previdenciaPrivada, seu saldo atual é de R$ "
					+ this.previdenciaPrivada);
		}
	}

}
