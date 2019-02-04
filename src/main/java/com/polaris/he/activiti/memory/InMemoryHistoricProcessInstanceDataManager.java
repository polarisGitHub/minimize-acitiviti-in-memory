package com.polaris.he.activiti.memory;

import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.impl.HistoricProcessInstanceQueryImpl;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.impl.persistence.entity.HistoricProcessInstanceEntity;
import org.activiti.engine.impl.persistence.entity.HistoricProcessInstanceEntityImpl;
import org.activiti.engine.impl.persistence.entity.data.HistoricProcessInstanceDataManager;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * User: hexie
 * Date: 2019-02-04 17:01
 * Description:
 */
public class InMemoryHistoricProcessInstanceDataManager extends AbstractInMemoryDataManager<HistoricProcessInstanceEntity> implements HistoricProcessInstanceDataManager {
    @Override
    public Class<? extends HistoricProcessInstanceEntity> getManagedEntityClass() {
        return HistoricProcessInstanceEntityImpl.class;
    }

    @Override
    public HistoricProcessInstanceEntity create() {
        return new HistoricProcessInstanceEntityImpl();
    }

    @Override
    public HistoricProcessInstanceEntity create(ExecutionEntity processInstanceExecutionEntity) {
        return new HistoricProcessInstanceEntityImpl(processInstanceExecutionEntity);
    }

    @Override
    public List<String> findHistoricProcessInstanceIdsByProcessDefinitionId(String processDefinitionId) {
        return Collections.emptyList();
    }

    @Override
    public List<HistoricProcessInstanceEntity> findHistoricProcessInstancesBySuperProcessInstanceId(String superProcessInstanceId) {
        return Collections.emptyList();
    }

    @Override
    public long findHistoricProcessInstanceCountByQueryCriteria(HistoricProcessInstanceQueryImpl historicProcessInstanceQuery) {
        return 0;
    }

    @Override
    public List<HistoricProcessInstance> findHistoricProcessInstancesByQueryCriteria(HistoricProcessInstanceQueryImpl historicProcessInstanceQuery) {
        return Collections.emptyList();
    }

    @Override
    public List<HistoricProcessInstance> findHistoricProcessInstancesAndVariablesByQueryCriteria(HistoricProcessInstanceQueryImpl historicProcessInstanceQuery) {
        return Collections.emptyList();
    }

    @Override
    public List<HistoricProcessInstance> findHistoricProcessInstancesByNativeQuery(Map<String, Object> parameterMap, int firstResult, int maxResults) {
        return Collections.emptyList();
    }

    @Override
    public long findHistoricProcessInstanceCountByNativeQuery(Map<String, Object> parameterMap) {
        return 0;
    }

}