package com.polaris.he.activiti.memory;

import org.activiti.engine.impl.persistence.entity.Entity;
import org.activiti.engine.impl.persistence.entity.ExecutionEntityImpl;
import org.activiti.engine.impl.persistence.entity.TaskEntityImpl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * User: hexie
 * Date: 2019-01-26 10:26
 * Description:
 */
public class DataManagerHolder {

    private static final Map<Class<? extends Entity>, ThreadLocal<Map<String, Object>>> DATA_MANAGER_MAP = Map.of(
            TaskEntityImpl.class, ThreadLocal.withInitial(LinkedHashMap::new),
            ExecutionEntityImpl.class, ThreadLocal.withInitial(LinkedHashMap::new)
    );

    public static void prepareStart() {
        DATA_MANAGER_MAP.forEach((key, value) -> value.remove());
    }

    static Map<String, Object> getDataMemoryStorage(Class<? extends Entity> clazz) {
        return Optional.ofNullable(DATA_MANAGER_MAP.get(clazz)).map(ThreadLocal::get).orElseThrow();
    }
}