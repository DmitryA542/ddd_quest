package Factory

import domain.User

class UserFactory {
    fun createUser(id: String, name: String, typeOfCard: String, typeOfPayment: String): User {
        return User(id, name, typeOfCard, typeOfPayment)
    }
}