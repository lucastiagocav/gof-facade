package br.bancointer.clientes;

import br.bancointer.operacoes.BancoInterFacade;
/*
 * Claudio tentou sacar valor acima do permitido
 * e n�o obteve �xito ao pedir um emprestimo, pois seu cpf est� negativado.
 */
public class ClienteClaudio {

	public static void main(String[] args) {
		BancoInterFacade bi = new BancoInterFacade();
		
		System.out.println("Inserir valor na poupan�a: ");
		bi.aplicarPoupanca(2000);
		
		System.out.println("\nSacar valor na poupan�a: ");
		bi.sacarPoupanca(3000);
		
		System.out.println("\nPedido de Emprestimo: ");
		bi.solicitarEmprestimo("1234567890", 10000);

	}

}
