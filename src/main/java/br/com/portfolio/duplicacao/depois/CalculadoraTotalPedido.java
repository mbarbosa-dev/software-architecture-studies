package br.com.portfolio.duplicacao.depois;

import java.math.BigDecimal;

public class CalculadoraTotalPedido {

    public BigDecimal calcular(
            BigDecimal subtotal,
            BigDecimal frete,
            BigDecimal desconto) {

        return subtotal.add(frete).subtract(desconto);
    }
}

/*
A lógica da refatoração é: identificar uma dificuldade na estrutura → reorganizar o código → verificar 
que o comportamento foi preservado.

Arquitetura logica: total = subtotal + frete − desconto

Depois da refatoração: A fórmula fica centralizada no método 
calcular da classe CalculadoraTotalPedido:

Agora, a fórmula possui um único lugar responsável por sua implementação.
Ainda não adicionamos a taxa de serviço: primeiro queremos comparar as
 estruturas sem alterar o resultado.

*/