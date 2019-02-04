package com.polaris.he.activiti.memory;

import org.activiti.engine.history.HistoricVariableInstance;
import org.activiti.engine.impl.HistoricVariableInstanceQueryImpl;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.persistence.entity.HistoricVariableInstanceEntity;
import org.activiti.engine.impl.persistence.entity.HistoricVariableInstanceEntityImpl;
import org.activiti.engine.impl.persistence.entity.data.HistoricVariableInstanceDataManager;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * User: hexie
 * Date: 2019-02-04 16:55
 * Description:
 */
public class InMemoryHistoricVariableInstanceDataManager extends AbstractInMemoryDataManager<HistoricVariableInstanceEntity> implements HistoricVariableInstanceDataManager {
    @Override
    public Class<? extends HistoricVariableInstanceEntity> getManagedEntityClass() {
        return HistoricVariableInstanceEntityImpl.class;
    }

    @Override
    public HistoricVariableInstanceEntity create() {
        return new HistoricVariableInstanceEntityImpl();
    }

    @Override
    public List<HistoricVariableInstanceEntity> findHistoricVariableInstancesByProcessInstanceId(String processInstanceId) {
        return Collections.emptyList();
    }

    @Override
    public List<HistoricVariableInstanceEntity> findHistoricVariableInstancesByTaskId(String taskId) {
        return Collections.emptyList();
    }

    @Override
    public long findHistoricVariableInstanceCountByQueryCriteria(HistoricVariableInstanceQueryImpl historicProcessVariableQuery) {
        return 0;
    }

    @Override
    public List<HistoricVariableInstance> findHistoricVariableInstancesByQueryCriteria(HistoricVariableInstanceQueryImpl historicProcessVariableQuery, Page page) {
        return Collections.emptyList();
    }

    @Override
    public HistoricVariableInstanceEntity findHistoricVariableInstanceByVariableInstanceId(String variableInstanceId) {
        return null;
    }

    @Override
    public List<HistoricVariableInstance> findHistoricVariableInstancesByNativeQuery(Map<String, Object> parameterMap, int firstResult, int maxResults) {
        return Collections.emptyList();
    }

    @Override
    public long findHistoricVariableInstanceCountByNativeQuery(Map<String, Object> parameterMap) {
        return 0;
    }

}