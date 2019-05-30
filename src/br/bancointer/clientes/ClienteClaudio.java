package br.bancointer.clientes;

import br.bancointer.operacoes.BancoInterFacade;
/*
 * Claudio tentou sacar valor acima do permitido
 * e não obteve êxito ao pedir um emprestimo, pois seu cpf está negativado.
 */
public class ClienteClaudio {

	public static void main(String[] args) {
		BancoInterFacade bi = new BancoInterFacade();
		
		System.out.println("Inserir valor na poupança: ");
		bi.aplicarPoupanca(2000);
		
		System.out.println("\nSacar valor na poupança: ");
		bi.sacarPoupanca(3000);
		
		System.out.println("\nPedido de Emprestimo: ");
		bi.solicitarEmprestimo("1234567890", 10000);

	}

}
