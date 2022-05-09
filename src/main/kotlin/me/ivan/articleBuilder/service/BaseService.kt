package me.ivan.articleBuilder.service

import me.ivan.articleBuilder.model.BaseEntity
import org.springframework.data.repository.CrudRepository
import java.io.Serializable

abstract class RudService<Id : Serializable, E : BaseEntity<Id>>(
    protected open val repository: CrudRepository<E, Id>,
) {
    fun get(id: Id) = repository.findById(id)

    fun delete(ent: E) = repository.delete(ent)

    fun update(ent: E, oldEnt: E): E {
        ent.id = oldEnt.id
        return repository.save(ent)
    }

}

abstract class CrudService<Id : Serializable, E : BaseEntity<Id>>(
    repository: CrudRepository<E, Id>,
) : RudService<Id, E>(
    repository,
) {
    fun create(ent: E) = repository.save(ent)
}