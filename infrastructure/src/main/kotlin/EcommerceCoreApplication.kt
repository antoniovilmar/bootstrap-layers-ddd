package example.ecommerce

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EcommerceCoreApplication

fun main(args: Array<String>) {
	runApplication<EcommerceCoreApplication>(*args)
}
