package me.ivan.articleBuilder.service

import me.ivan.articleBuilder.model.Author
import me.ivan.articleBuilder.model.AuthorId
import me.ivan.articleBuilder.repo.AuthorRepo
import org.springframework.stereotype.Service

@Service
class AuthorService(
    authorRepo: AuthorRepo,
) : CrudService<AuthorId, Author>(
    authorRepo,
) {
}