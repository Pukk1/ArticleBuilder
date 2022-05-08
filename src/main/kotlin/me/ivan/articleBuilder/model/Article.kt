package me.ivan.articleBuilder.model

import javax.persistence.*

typealias ArticleId = Long

@Entity
class Article(
    var archived: Boolean = false
) : BaseEntity<ArticleId>() {

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "article_author",
        joinColumns = [JoinColumn(name = "article_id")],
        inverseJoinColumns = [JoinColumn(name = "author_id")]
    )
    lateinit var authors: MutableList<Author>
}