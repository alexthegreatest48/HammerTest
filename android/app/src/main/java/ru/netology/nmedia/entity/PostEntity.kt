package ru.netology.nmedia.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import ru.netology.nmedia.dto.Post

@Entity
data class PostEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    var name: String,
    var photo: String,
    var ingridients: String,
    var price: Int = 0
) {
    fun toDto() = Post(id, name, photo, ingridients, price)

    companion object {
        fun fromDto(dto: Post) =
            PostEntity(dto.id, dto.name, dto.photo, dto.ingridients, dto.price)

    }
}

fun List<PostEntity>.toDto(): List<Post> = map(PostEntity::toDto)
fun List<Post>.toEntity(): List<PostEntity> = map(PostEntity::fromDto)
