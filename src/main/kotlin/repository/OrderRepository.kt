package repository

import domain.Order

class OrderRepository {
    private val orders = ArrayList<Order>()

    fun save(order: Order){
        orders.add(order)
    }
    fun getOrderByStatus(orderId: String): Order {
        return orders.get(orderId.toInt() - 1)
    }
}