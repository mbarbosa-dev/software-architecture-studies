## Análise da refatoração

Na implementação inicial, os métodos calcularTotalCarrinho
e calcularTotalConfirmacao implementam a mesma fórmula:

total = subtotal + frete - desconto

Na versão refatorada, essa fórmula fica no método calcular
da classe CalculadoraTotalPedido. Os dois fluxos passam
a utilizar essa implementação.

| Antes | Depois |
|---|---|
| Dois métodos implementam a fórmula | Um método implementa a fórmula |
| Cada fluxo conhece os detalhes do cálculo | Cada fluxo solicita o cálculo |
| Alterações exigem atualizar dois lugares | Alterações ficam concentradas na calculadora |

### Por que centralizar?

Neste exemplo, carrinho e confirmação seguem a mesma regra
de total do pedido. Uma mudança nessa regra deve ser aplicada
de maneira consistente aos dois fluxos.

### O que permanece igual?

Para subtotal de R$ 100,00, frete de R$ 10,00 e desconto
de R$ 15,00, o resultado esperado nas duas versões é R$ 95,00.

A refatoração altera a organização do código, preservando
o comportamento.

### Quando não compartilhar?

Se dois cálculos representarem políticas independentes,
a semelhança entre as fórmulas não é suficiente para
justificar uma implementação compartilhada.