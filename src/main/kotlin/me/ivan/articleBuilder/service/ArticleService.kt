package me.ivan.articleBuilder.service

import me.ivan.articleBuilder.model.Article
import me.ivan.articleBuilder.model.ArticleId
import me.ivan.articleBuilder.repo.ArticleRepo
import org.springframework.stereotype.Service

@Service
class ArticleService(
    articleRepo: ArticleRepo,
) : CrudService<ArticleId, Article>(
    articleRepo,
) {
}