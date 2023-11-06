package ru.netology.nmedia.dto

import jakarta.persistence.Column
import ru.netology.nmedia.enumeration.AttachmentType

data class Post(
    val id: Long,
    var name: String,
    var photo: String,
    var ingridients: String,
    var price: Int,
    var attachment: Attachment? = null,
)

data class Attachment(
    val url: String,
    val description: String?,
    val type: AttachmentType,
)
