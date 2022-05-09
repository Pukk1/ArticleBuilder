package me.ivan.articleBuilder.repo

import me.ivan.articleBuilder.model.Article
import me.ivan.articleBuilder.model.ArticleId
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ArticleRepo : CrudRepository<Article, ArticleId>{

}