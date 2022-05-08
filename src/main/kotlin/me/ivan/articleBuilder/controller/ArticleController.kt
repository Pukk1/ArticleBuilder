package me.ivan.articleBuilder.controller

import me.ivan.articleBuilder.model.Article
import me.ivan.articleBuilder.model.dto.ArticleDto
import org.modelmapper.ModelMapper
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/article")
class ArticleController(
    modelMapper: ModelMapper
) : CrudController<Article, ArticleDto>(
    modelMapper
) {

}