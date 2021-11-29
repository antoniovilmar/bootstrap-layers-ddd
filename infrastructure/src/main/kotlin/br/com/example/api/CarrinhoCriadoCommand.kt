package example.ecommerce.carrinho.api

data class CarrinhoCriadoCommand(
    val clienteId: String,
    val itemId: String,
    val itemQuantidade: Long
)

