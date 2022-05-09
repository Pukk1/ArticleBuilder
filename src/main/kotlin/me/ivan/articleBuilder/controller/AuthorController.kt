package me.ivan.articleBuilder.controller

import me.ivan.articleBuilder.model.Author
import me.ivan.articleBuilder.model.AuthorId
import me.ivan.articleBuilder.controller.dto.AuthorDto
import me.ivan.articleBuilder.service.AuthorService
import org.modelmapper.ModelMapper
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/author")
class AuthorController(
    modelMapper: ModelMapper,
    authorService: AuthorService,
) : CrudController<AuthorId, Author, AuthorDto>(
    modelMapper,
    authorService,
    Author::class.java,
    AuthorDto::class.java,
) {

}