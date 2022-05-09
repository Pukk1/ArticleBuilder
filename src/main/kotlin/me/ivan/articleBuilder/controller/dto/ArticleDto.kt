package me.ivan.articleBuilder.controller.dto

import me.ivan.articleBuilder.model.ArticleId

class ArticleDto : EntDto<ArticleId>() {
    var archived: Boolean? = null
    var articles: MutableList<ArticleDto> = mutableListOf()
}
