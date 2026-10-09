package br.com.portfolio.duplicacao.antes;

import java.math.BigDecimal;

public class PedidoDuplicado {

    public BigDecimal calcularTotalCarrinho(
            BigDecimal subtotal,
            BigDecimal frete,
            BigDecimal desconto) {

        return subtotal.add(frete).subtract(desconto);
    }

    public BigDecimal calcularTotalConfirmacao(
            BigDecimal subtotal,
            BigDecimal frete,
            BigDecimal desconto) {

        return subtotal.add(frete).subtract(desconto);
    }
}

/*
Como os dois métodos representam a mesma regra de negócio, uma alteração 
nessa regra precisa ser aplicada em ambas as implementações. Se apenas uma 
for atualizada, os métodos podem retornar totais diferentes para os mesmos dados 
de entrada.

Essa classe simula dois pontos da aplicação: carrinho e confirmação.
A duplicação está nas duas expressões de cálculo. Se a mesma regra do 
pedido mudar, precisaremos atualizar os dois métodos
 */