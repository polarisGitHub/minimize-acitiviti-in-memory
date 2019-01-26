package com.polaris.he.activiti.memory;

import org.activiti.engine.impl.persistence.entity.Entity;
import org.activiti.engine.impl.persistence.entity.data.DataManager;

import java.util.Map;
import java.util.UUID;

/**
 * User: hexie
 * Date: 2019-01-26 10:19
 * Description:
 */
public abstract class AbstractInMemoryDataManager<T extends Entity> implements DataManager<T> {

    public abstract Class<? extends T> getManagedEntityClass();

    @SuppressWarnings("unchecked")
    public T findById(String entityId) {
        return (T) getStorage(getManagedEntityClass()).get(entityId);
    }

    public void insert(T entity) {
        entity.setId(UUID.randomUUID().toString().replace("-", ""));
        DataManagerHolder.getDataMemoryStorage(getManagedEntityClass()).put(entity.getId(), entity);
    }

    @SuppressWarnings("unchecked")
    public T update(T entity) {
        return (T) getStorage(getManagedEntityClass()).put(entity.getId(), entity);
    }

    public void delete(String id) {
        getStorage(getManagedEntityClass()).remove(id);
    }

    public void delete(T entity) {
        getStorage(getManagedEntityClass()).remove(entity.getId());
    }


    protected <R extends Entity> Map<String, Object> getStorage(Class<R> clazz) {
        return DataManagerHolder.getDataMemoryStorage(clazz);
    }
}