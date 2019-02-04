package com.polaris.he.activiti.memory;

import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.impl.HistoricActivityInstanceQueryImpl;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.persistence.entity.HistoricActivityInstanceEntity;
import org.activiti.engine.impl.persistence.entity.HistoricActivityInstanceEntityImpl;
import org.activiti.engine.impl.persistence.entity.data.HistoricActivityInstanceDataManager;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * User: hexie
 * Date: 2019-02-04 16:45
 * Description:
 */
public class InMemoryHistoricActivityInstanceDataManager extends AbstractInMemoryDataManager<HistoricActivityInstanceEntity> implements HistoricActivityInstanceDataManager {

    @Override
    public Class<? extends HistoricActivityInstanceEntity> getManagedEntityClass() {
        return HistoricActivityInstanceEntityImpl.class;
    }

    @Override
    public HistoricActivityInstanceEntity create() {
        return new HistoricActivityInstanceEntityImpl();
    }

    @Override
    public List<HistoricActivityInstanceEntity> findUnfinishedHistoricActivityInstancesByExecutionAndActivityId(String executionId, String activityId) {
        return Collections.emptyList();
    }

    @Override
    public List<HistoricActivityInstanceEntity> findUnfinishedHistoricActivityInstancesByProcessInstanceId(String processInstanceId) {
        return Collections.emptyList();
    }

    @Override
    public void deleteHistoricActivityInstancesByProcessInstanceId(String historicProcessInstanceId) {

    }

    @Override
    public long findHistoricActivityInstanceCountByQueryCriteria(HistoricActivityInstanceQueryImpl historicActivityInstanceQuery) {
        return 0;
    }

    @Override
    public List<HistoricActivityInstance> findHistoricActivityInstancesByQueryCriteria(HistoricActivityInstanceQueryImpl historicActivityInstanceQuery, Page page) {
        return Collections.emptyList();
    }

    @Override
    public List<HistoricActivityInstance> findHistoricActivityInstancesByNativeQuery(Map<String, Object> parameterMap, int firstResult, int maxResults) {
        return Collections.emptyList();
    }

    @Override
    public long findHistoricActivityInstanceCountByNativeQuery(Map<String, Object> parameterMap) {
        return 0;
    }
}