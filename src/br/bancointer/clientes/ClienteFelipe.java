package br.bancointer.clientes;

import br.bancointer.operacoes.BancoInterFacade;
/*
 * Felipe obteve êxito em aplicar um valor, sacar um valor,
 * porém, solicitou um empréstimo acima do permitido.
 */
public class ClienteFelipe {

	public static void main(String[] args) {
		BancoInterFacade bi = new BancoInterFacade();
		
		System.out.println("Inserir valor na poupança: ");
		bi.aplicarPrevidencia(8000);
		
		System.out.println("\nSacar valor na poupança: ");
		bi.sacarPrevidencia(3000);
		
		System.out.println("\nPedido de Emprestimo: ");
		bi.solicitarEmprestimo("732648346", 11000);

	}

}
