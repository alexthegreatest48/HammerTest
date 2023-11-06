package ru.netology.nmedia

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.scheduling.annotation.EnableScheduling
import ru.netology.nmedia.dto.Attachment
import ru.netology.nmedia.dto.Comment
import ru.netology.nmedia.dto.Post
import ru.netology.nmedia.enumeration.AttachmentType
import ru.netology.nmedia.service.CommentService
import ru.netology.nmedia.service.PostService

@EnableScheduling
@SpringBootApplication
class NMediaApplication {
    @Bean
    fun runner(postService: PostService, commentService: CommentService) = CommandLineRunner {
        val firstPost = postService.saveInitial(
            Post(
                id = 0,
                name = "Карбонара",
                photo = "carbonara.jpg",
                ingridients = "Бекон, сыры чеддер и пармезан, моцарелла, томаты, красный лук, чеснок, фирменный соус альфредо, итальянские травы",
                price = 839
            )
        )
        val secondPost = postService.saveInitial(
            Post(
                id = 0,
                name = "Сырная",
                photo = "Cheese.jpg",
                ingridients = "Моцарелла, сыры чеддер и пармезан, фирменный соус альфредо",
                price = 539
            )
        )
        val thirdPost = postService.saveInitial(
            Post(
                id = 0,
                name = "Пицца Жюльен",
                photo = "julien.jpg",
                ingridients = "Цыпленок, шампиньоны, ароматный грибной соус, красный лук, чеснок, моцарелла, смесь сыров чеддер и пармезан, фирменный соус альфредо",
                price = 653
            )
        )
        val fourthPost = postService.saveInitial(
            Post(
                id = 0,
                name = "Мясная",
                photo = "meat.jpg",
                ingridients = "Цыпленок, ветчина, пикантная пепперони, острая чоризо, моцарелла, фирменный томатный соус",
                price = 342
            )
        )
        val fifthPost = postService.saveInitial(
            Post(
                id = 0,
                name = "Пицца Миксик",
                photo = "miksik.jpg",
                ingridients = "Пицца четвертинками с ветчиной, цыпленком, томатами, брынзой, моцареллой, фирменным соусом альфредо",
                price = 648
            )
        )
        val sixPost = postService.saveInitial(
            Post(
                id = 0,
                name = "Пеперони",
                photo = "peperoni.jpg",
                ingridients = "Бекон, сыры чеддер и пармезан, моцарелла, томаты, красный лук, чеснок, фирменный соус альфредо, итальянские травы",
                price = 290
            )
        )
        val sevenPost = postService.saveInitial(
            Post(
                id = 0,
                name = "Песто",
                photo = "pesto.jpg",
                ingridients = "Цыпленок, соус песто, кубики брынзы, томаты, моцарелла, фирменный соус альфредо",
                price = 765
            )
        )
        val eightPost = postService.saveInitial(
            Post(
                id = 0,
                name = "Трюфельная",
                photo = "trufel.jpg",
                ingridients = "Мортаделла, трюфельный соус, шампиньоны, красный лук, моцарелла, фирменный соус альфредо, чеснок",
                price = 839
            )
        )
    }

}

fun main(args: Array<String>) {
    runApplication<NMediaApplication>(*args)
}
