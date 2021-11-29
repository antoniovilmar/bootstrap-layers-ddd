# Projeto

O projeto contém um bootstrap para layers do DDD (Infrastructure, Application e Domain)

# Tecnologias

- Gradle
- Spring boot
- Kotlin com JDK 11

# Desafio

A temática do projeto é sobre ecommerce, os desafios devem ser implementados utilizando o padrão Rest.
As layers estão baseadas em uma estrutura utilizando DDD, durante o desafio 1, deve trazer o conceito das camadas do Clean Architecture, encaixando cada "camada" do  Clean Architecture dentro das layers do DDD.

## Desafio 1

Implementar uma solução que simula um carrinho de compras (Possível adicionar e remover itens), quando efetuar a compra dos itens do carrinho, deve processar a venda da seguinte maneira:

- considerar valor de frete
- considerar cupom de desconto
- após aplicar o desconto, deve atualizar o valor total do pedido
- validar o cartão de cŕédito do cliente
- após, deve concretizar a venda. 

## Desafio 2

Implementar uma rota que lista todas vendas.

# Referências

- https://archfirst.org/domain-driven-design-6-layered-architecture/
- https://www.baeldung.com/spring-boot-clean-architecture


