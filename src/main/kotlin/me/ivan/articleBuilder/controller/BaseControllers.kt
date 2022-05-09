package me.ivan.articleBuilder.controller

import me.ivan.articleBuilder.model.BaseEntity
import me.ivan.articleBuilder.controller.dto.EntDto
import me.ivan.articleBuilder.service.CrudService
import me.ivan.articleBuilder.service.RudService
import org.modelmapper.ModelMapper
import org.springframework.web.bind.annotation.*
import java.io.Serializable

abstract class RudController<Id : Serializable, E : BaseEntity<Id>, D : EntDto<Id>>(
    private val modelMapper: ModelMapper,

    protected open val service: RudService<Id, E>,

    private val baseEntityClass: Class<E>,
    private val baseDtoClass: Class<D>,
) {
    open fun mapDto(ent: E) = modelMapper.map(ent, baseDtoClass)!!
    open fun mapDto(dto: D): E = modelMapper.map(dto, baseEntityClass)!!

    @GetMapping("/{id}")
    open fun read(@PathVariable("id") ent: E) = mapDto(ent)

    @PutMapping("/{id}")
    open fun update(@RequestBody dto: D, @PathVariable("id") oldEnt: E) = mapDto(service.update(mapDto(dto), oldEnt))

    @DeleteMapping("/{id}")
    open fun delete(@PathVariable("id") ent: E) = service.delete(ent)
}


abstract class CrudController<Id : Serializable, E : BaseEntity<Id>, D : EntDto<Id>>(
    modelMapper: ModelMapper,

    override val service: CrudService<Id, E>,

    baseEntityClass: Class<E>,
    baseDtoClass: Class<D>,
) : RudController<Id, E, D>(
    modelMapper,
    service,
    baseEntityClass,
    baseDtoClass,
) {
    @PostMapping
    open fun create(@RequestBody dto: D) = service.create(mapDto(dto))
}