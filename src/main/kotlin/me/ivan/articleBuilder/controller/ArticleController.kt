package me.ivan.articleBuilder.controller

import me.ivan.articleBuilder.model.Article
import me.ivan.articleBuilder.model.ArticleId
import me.ivan.articleBuilder.controller.dto.ArticleDto
import me.ivan.articleBuilder.service.ArticleService
import org.modelmapper.ModelMapper
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/article")
class ArticleController(
    modelMapper: ModelMapper,
    articleService: ArticleService,
) : CrudController<ArticleId, Article, ArticleDto>(
    modelMapper,
    articleService,
    Article::class.java,
    ArticleDto::class.java,
) {

}