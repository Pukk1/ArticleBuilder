package me.ivan.articleBuilder.repo

import me.ivan.articleBuilder.model.Author
import me.ivan.articleBuilder.model.AuthorId
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRep : CrudRepository<AuthorId, Author>{

}