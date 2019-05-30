package br.bancointer.clientes;

import br.bancointer.operacoes.BancoInterFacade;
/*
 * Carlos inseriu valores no tesouro direto,
 * obteve êxito no saque e no pedido de empréstimo.
 */
public class ClienteCarlos {

	public static void main(String[] args) {
		BancoInterFacade bi = new BancoInterFacade();
		
		System.out.println("Inserir valor no Tesouro Direto: ");
		bi.aplicarTD(3000);
		
		System.out.println("\nSacar valor no Tesouro Direto: ");
		bi.sacarTD(3000);
		
		System.out.println("\nPedido de Emprestimo: ");
		bi.solicitarEmprestimo("123456780", 10000);

	}

}
