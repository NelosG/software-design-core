package ru.ifmo.pga.software.design.todo.list.dao

import ru.ifmo.pga.software.design.todo.list.entity.AbstractEntity

/**
 * @author Gleb Pushkarev
 * @since 1.0.0
 */
interface Dao<T : AbstractEntity> {

    fun findAll(): List<T>

    fun findById(id: Long): T

    fun save(entity: T): T

    fun save(entities: Collection<T>): List<T>

    fun remove(entity: T)

    fun remove(id: Long)

    val entityClass: Class<T>
}
