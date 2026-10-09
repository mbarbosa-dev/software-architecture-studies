package br.com.portfolio.duplicacao.depois;

import br.com.portfolio.duplicacao.antes.PedidoDuplicado;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BigDecimal subtotal = new BigDecimal("100.00");
        BigDecimal frete = new BigDecimal("10.00");
        BigDecimal desconto = new BigDecimal("15.00");

        // Antes: dois métodos implementam a mesma fórmula.
        PedidoDuplicado pedido = new PedidoDuplicado();

        BigDecimal carrinhoAntes = pedido.calcularTotalCarrinho(
                subtotal, frete, desconto);

        BigDecimal confirmacaoAntes = pedido.calcularTotalConfirmacao(
                subtotal, frete, desconto);

        // Depois: os dois pontos utilizam a mesma calculadora.
        CalculadoraTotalPedido calculadora =
                new CalculadoraTotalPedido();

        BigDecimal carrinhoDepois = calculadora.calcular(
                subtotal, frete, desconto);

        BigDecimal confirmacaoDepois = calculadora.calcular(
                subtotal, frete, desconto);

        System.out.println("Antes - carrinho: " + carrinhoAntes);
        System.out.println("Antes - confirmação: " + confirmacaoAntes);
        System.out.println("Depois - carrinho: " + carrinhoDepois);
        System.out.println("Depois - confirmação: " + confirmacaoDepois);
    }
}

/*
O Main é uma demonstração em console. Ele representa as chamadas que os 
fluxos de carrinho e confirmação fariam; ainda não estamos construindo telas
*/