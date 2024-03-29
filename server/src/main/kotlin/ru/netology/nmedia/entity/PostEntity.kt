package ru.netology.nmedia.entity

import ru.netology.nmedia.dto.Attachment
import ru.netology.nmedia.dto.Post
import ru.netology.nmedia.enumeration.AttachmentType
import jakarta.persistence.*

@Entity
data class PostEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long,
    var name: String,
    var photo: String,
    @Column(columnDefinition = "TEXT")
    var ingridients: String,
    var price: Int,
    @Embedded
    var attachment: AttachmentEmbeddable?,
) {
    fun toDto() = Post(id, name, photo, ingridients, price, attachment?.toDto())

    companion object {
        fun fromDto(dto: Post) = PostEntity(
            dto.id,
            dto.name,
            dto.photo,
            dto.ingridients,
            dto.price,
            AttachmentEmbeddable.fromDto(dto.attachment),
        )
    }
}

@Embeddable
data class AttachmentEmbeddable(
    var url: String,
    @Column(columnDefinition = "TEXT")
    var description: String?,
    @Enumerated(EnumType.STRING)
    var type: AttachmentType,
) {
    fun toDto() = Attachment(url, description, type)

    companion object {
        fun fromDto(dto: Attachment?) = dto?.let {
            AttachmentEmbeddable(it.url, it.description, it.type)
        }
    }
}
