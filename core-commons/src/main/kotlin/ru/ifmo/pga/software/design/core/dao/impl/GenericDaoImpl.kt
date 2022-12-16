package ru.ifmo.pga.software.design.core.dao.impl

import ru.ifmo.pga.software.design.core.entity.AbstractEntity
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

/**
 * @author Gleb Pushkarev
 * @since 1.0.0
 */
abstract class GenericDaoImpl<T : AbstractEntity> : DaoImpl<T>() {
    @set:PersistenceContext(unitName = "SoftwareDesignUnit")
    override var entityManager: EntityManager
        get() = super.entityManager
        set(entityManager) {
            super.entityManager = entityManager
        }
}
