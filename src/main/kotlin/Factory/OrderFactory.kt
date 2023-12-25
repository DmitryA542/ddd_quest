package Factory

import domain.Address
import domain.Order
import domain.Status

class OrderFactory {
    fun createOrder(id: String, status: Enum<Status>, products: List<String>, deliveryAddress: Address): Order {
        return Order(id, status, products, deliveryAddress)
    }
}