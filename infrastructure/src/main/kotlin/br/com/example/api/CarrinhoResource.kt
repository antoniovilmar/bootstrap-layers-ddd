package example.ecommerce.br.com.example.api

import example.ecommerce.carrinho.api.CarrinhoCriadoCommand
import example.ecommerce.carrinho.domain.Carrinho
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CarrinhoResource {

    @PostMapping("/carrinho")
    fun criar(@RequestBody carrinhoCommand: CarrinhoCriadoCommand): ResponseEntity<Carrinho> {
        return ResponseEntity.ok(Carrinho(carrinhoCommand.clienteId, carrinhoCommand.itemId, carrinhoCommand.itemQuantidade))
    }
}