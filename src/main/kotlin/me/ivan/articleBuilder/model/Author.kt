package me.ivan.articleBuilder.model

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.ManyToMany

typealias AuthorId = Long

@Entity
class Author(
    var archived: Boolean = false
) : BaseEntity<AuthorId>() {
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "authors")
    lateinit var articles: MutableList<Article>
}