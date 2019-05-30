package br.bancointer.clientes;

import br.bancointer.operacoes.BancoInterFacade;
/*
 * Felipe obteve �xito em aplicar um valor, sacar um valor,
 * por�m, solicitou um empr�stimo acima do permitido.
 */
public class ClienteFelipe {

	public static void main(String[] args) {
		BancoInterFacade bi = new BancoInterFacade();
		
		System.out.println("Inserir valor na poupan�a: ");
		bi.aplicarPrevidencia(8000);
		
		System.out.println("\nSacar valor na poupan�a: ");
		bi.sacarPrevidencia(3000);
		
		System.out.println("\nPedido de Emprestimo: ");
		bi.solicitarEmprestimo("732648346", 11000);

	}

}
