package domain

data class Order(val id: String, val status: Enum<Status>, val products: List<String>, val deliveryAddress: Address){
    init {
        require(id.isNotEmpty()) { "Идентификаторы сущностей не могут быть пустыми" }
        require(products.isNotEmpty()) { "Заказ должен содержать хотя бы один продукт" }
    }
}