package ru

data class Client(
        var id: String? = null,
        var level: Int? = null,
        var children: List<Client>? = null
)