package me.ivan.articleBuilder.config

import me.ivan.articleBuilder.controller.dto.AuthorDto
import me.ivan.articleBuilder.controller.dto.EntDto
import me.ivan.articleBuilder.model.Author
import me.ivan.articleBuilder.model.BaseEntity
import org.modelmapper.ExpressionMap
import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ModelMapperConfig {

    var mapper: ModelMapper = ModelMapper()

    @Bean
    fun modelMapper(): ModelMapper {

//        adding mapping configs in further
//        configAuthorMapping()

        return mapper
    }

    fun configAuthorMapping() {
        propertyMapper<Author, AuthorDto>(
            toDto = {mapper ->
                mapper
                    .map(Author::archived, AuthorDto::archived.setter)
            },
            fromDto = {mapper ->
                mapper
                    .map(AuthorDto::archived, Author::archived.setter)
            }
        )
    }

    private inline fun <reified E : BaseEntity<*>, reified D : EntDto<*>> propertyMapper(
        toDto: ExpressionMap<E, D>,
        fromDto: ExpressionMap<D, E>,
    ) {
         mapper.typeMap(E::class.java, D::class.java).addMappings(toDto)
         mapper.typeMap(D::class.java, E::class.java).addMappings(fromDto)
    }
}