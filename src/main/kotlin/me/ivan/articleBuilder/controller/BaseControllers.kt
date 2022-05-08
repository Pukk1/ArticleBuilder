package me.ivan.articleBuilder.controller

import me.ivan.articleBuilder.model.BaseEntity
import me.ivan.articleBuilder.model.dto.BaseDto
import org.modelmapper.ModelMapper

abstract class RudController<T : BaseEntity<*>, E : BaseDto>(
    val modelMapper: ModelMapper
) {
    inline fun <reified E> mapDto(ent: T) = modelMapper.map(ent, E::class.java)!!
    inline fun <reified T> mapDto(dto: E) = modelMapper.map(dto, T::class.java)!!
}

abstract class CrudController<T : BaseEntity<*>, E : BaseDto>(
    modelMapper: ModelMapper
) : RudController<T, E>(modelMapper) {

}