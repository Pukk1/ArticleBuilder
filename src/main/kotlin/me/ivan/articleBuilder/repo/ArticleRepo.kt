package me.ivan.articleBuilder.repo

import me.ivan.articleBuilder.model.Article
import me.ivan.articleBuilder.model.ArticleId
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.rest.core.annotation.Description
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource
import org.springframework.stereotype.Repository

@Repository
@RepositoryRestResource(path = "people")
interface ArticleRepo : JpaRepository<Article, ArticleId> {
    // access by
    @RestResource(path = "archived")
    @Query("select a from Article a where a.archived=false")
    fun findAllByArchived(): List<Article>
}