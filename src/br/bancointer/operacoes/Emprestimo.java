package br.bancointer.operacoes;

/*
 * Dica: deixar as classes com os modificadores de acesso 
 * Default para não serem acessadas de fora do pacote.
 * Isso garante a funcionalidade do FACADE.
 */
class Emprestimo {
	private String[] negativados = { "1234567890", "0987654321", "0000000000" };
	private final double EMPRESTIMO_MAXIMO = 10000;

	public Emprestimo() {
		super();
	}

	/*
	 * Não aplicarei as regras de negócio, apenas uma simbólica pra dar mais
	 * intuição à aplicação.
	 * 
	 */
	public void solicitarEmprestimo(String cpf, double valor) {
		boolean negativado = false;
		if (valor > EMPRESTIMO_MAXIMO) {
			System.out.println("Valor maior que o permitido, solicite um valor menor que R$ " + EMPRESTIMO_MAXIMO);
		} else {
			System.out.println("Analizando o seu pedido...");
		}
		for (int i = 0; i < negativados.length; i++) {
			if (cpf.equals(negativados[i])) {
				negativado = true;
				System.out.println("Você está negativado, não podemos fazer este empréstimo.");
			}
		}
		if (negativado == false && valor <= EMPRESTIMO_MAXIMO) {
			System.out.println("Sucesso, seu emprestimo foi concedido, no valor de R$ " + valor);
		}
	}
}
