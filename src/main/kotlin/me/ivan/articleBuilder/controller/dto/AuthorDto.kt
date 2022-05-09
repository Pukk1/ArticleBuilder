package me.ivan.articleBuilder.controller.dto

import me.ivan.articleBuilder.model.AuthorId

class AuthorDto() : EntDto<AuthorId>() {
    var archived: Boolean? = null
    var authors: MutableList<AuthorDto> = mutableListOf()
}
