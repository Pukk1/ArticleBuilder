package me.ivan.articleBuilder.controller

import me.ivan.articleBuilder.model.Author
import me.ivan.articleBuilder.model.dto.AuthorDto
import org.modelmapper.ModelMapper
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/author")
class AuthorController(
    modelMapper: ModelMapper
) : CrudController<Author, AuthorDto>(
    modelMapper
) {

}