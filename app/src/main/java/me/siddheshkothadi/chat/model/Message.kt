package me.siddheshkothadi.chat.model

data class Message(
    val from: String = "",
    val to: String = "",
    val timestamp: String = "",
    val content: String = ""
)
