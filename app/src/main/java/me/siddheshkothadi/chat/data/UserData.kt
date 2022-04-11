package me.siddheshkothadi.chat.data

import kotlinx.serialization.Serializable
import me.siddheshkothadi.chat.model.User

@Serializable
data class UserData(
    val user: User = User(),
    val privateKey: String = "",
    val secretKey: String = ""
)