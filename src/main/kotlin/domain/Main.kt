package domain

import Factory.OrderFactory
import Factory.UserFactory
import repository.OrderRepository
import repository.UserRepository

fun main() {
    val orderRepository = OrderRepository()
    val orderFactory = OrderFactory()
    val userFactory = UserFactory()
    val userRepository = UserRepository()

    // Создание Пользователя и заказа
    val address: Address = Address("New York", "avenue", "123")
    val user = userFactory.createUser("1", "John Dow", "Mastercard", "card")
    val order = orderFactory.createOrder("1", Status.Rejected, listOf("apple", "banana"), address)

    // Сохранение пользователя и заказа
    userRepository.save(user)
    orderRepository.save(order)

    // Пользователь по его Id
    println(userRepository.getUserById("1"))

    // Заказ по его Id
    println(orderRepository.getOrderByStatus("1"))
}