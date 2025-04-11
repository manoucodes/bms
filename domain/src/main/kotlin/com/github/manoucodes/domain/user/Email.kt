package com.github.manoucodes.domain.user

@JvmInline
value class Email(
    val value: String,
) {
    init {
        require(value.isNotBlank()) { "Email cannot be blank" }

        require(value.matches(Regex("^[^@\\s]+@[^@\\s]+\\.[^@\\s]{2,}$"))) {
            "Invalid email format: $value"
        }
    }

    override fun toString(): String = value.lowercase()
}
