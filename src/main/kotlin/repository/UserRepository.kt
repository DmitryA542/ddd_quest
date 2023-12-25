package repository

import domain.User

class UserRepository {
    private val users = ArrayList<User>()

    fun save(user: User){
        users.add(user)
    }
    fun getUserById(userId: String): User {
        return users.get(userId.toInt() - 1)
    }
}