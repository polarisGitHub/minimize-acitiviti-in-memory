package com.polaris.he.activiti.memory;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.impl.persistence.entity.data.impl.MybatisProcessDefinitionDataManager;

import java.util.concurrent.TimeUnit;

/**
 * User: hexie
 * Date: 2019-01-26 13:44
 * Description:
 */
public class CachedMybatisProcessDefinitionDataManager extends MybatisProcessDefinitionDataManager {

    private LoadingCache<String, ProcessDefinitionEntity> cache = CacheBuilder.newBuilder().
            concurrencyLevel(16).
            expireAfterWrite(5, TimeUnit.MINUTES).
            build(new CacheLoader<>() {
                @Override
                public ProcessDefinitionEntity load(String s) throws Exception {
                    return doFindById(s);
                }
            });

    public CachedMybatisProcessDefinitionDataManager(ProcessEngineConfigurationImpl processEngineConfiguration) {
        super(processEngineConfiguration);
    }


    @Override
    public ProcessDefinitionEntity findById(String entityId) {
        return cache.getUnchecked(entityId);
    }


    private ProcessDefinitionEntity doFindById(String entityId) {
        return super.findById(entityId);
    }
}