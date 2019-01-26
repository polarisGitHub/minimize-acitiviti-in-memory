package com.polaris.he.activiti.memory;

import org.activiti.engine.impl.ExecutionQueryImpl;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.ProcessInstanceQueryImpl;
import org.activiti.engine.impl.persistence.entity.ExecutionEntity;
import org.activiti.engine.impl.persistence.entity.ExecutionEntityImpl;
import org.activiti.engine.impl.persistence.entity.data.ExecutionDataManager;
import org.activiti.engine.runtime.Execution;
import org.activiti.engine.runtime.ProcessInstance;

import java.util.*;

/**
 * User: hexie
 * Date: 2019-01-26 11:35
 * Description:
 */
public class InMemoryExecutionInMemoryDataManager extends AbstractInMemoryDataManager<ExecutionEntity> implements ExecutionDataManager {


    @Override
    public ExecutionEntity create() {
        return ExecutionEntityImpl.createWithEmptyRelationshipCollections();
    }

    @Override
    public Class<? extends ExecutionEntity> getManagedEntityClass() {
        return ExecutionEntityImpl.class;
    }

    @Override
    public Collection<ExecutionEntity> findInactiveExecutionsByProcessInstanceId(String processInstanceId) {
        return null;
    }


    @Override
    public List<ExecutionEntity> findExecutionsByProcessInstanceId(String processInstanceId) {
        return null;
    }

    @Override
    public List<String> findProcessInstanceIdsByProcessDefinitionId(String processDefinitionId) {
        return null;
    }

    @Override
    public List<ExecutionEntity> findChildExecutionsByProcessInstanceId(String processInstanceId) {
        return Collections.emptyList();
    }

    @Override
    public ExecutionEntity findSubProcessInstanceBySuperExecutionId(String superExecutionId) {
        return null;
    }

    @Override
    public List<ExecutionEntity> findChildExecutionsByParentExecutionId(String parentExecutionId) {
        return Collections.emptyList();
    }

    @Override
    public List<ExecutionEntity> findExecutionsByParentExecutionAndActivityIds(String parentExecutionId, Collection<String> activityIds) {
        return Collections.emptyList();
    }

    @Override
    public long findExecutionCountByQueryCriteria(ExecutionQueryImpl executionQuery) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<ExecutionEntity> findExecutionsByQueryCriteria(ExecutionQueryImpl executionQuery, Page page) {
        return Collections.emptyList();
    }

    @Override
    public List<ProcessInstance> findProcessInstanceByQueryCriteria(ProcessInstanceQueryImpl executionQuery) {
        return Collections.emptyList();
    }

    @Override
    public List<ExecutionEntity> findExecutionsByRootProcessInstanceId(String rootProcessInstanceId) {
        return Collections.emptyList();
    }

    @Override
    public List<ProcessInstance> findProcessInstanceAndVariablesByQueryCriteria(ProcessInstanceQueryImpl executionQuery) {
        return Collections.emptyList();
    }

    @Override
    public Collection<ExecutionEntity> findInactiveExecutionsByActivityIdAndProcessInstanceId(String activityId, String processInstanceId) {
        return Collections.emptyList();
    }

    @Override
    public List<Execution> findExecutionsByNativeQuery(Map<String, Object> parameterMap, int firstResult, int maxResults) {
        return Collections.emptyList();
    }

    @Override
    public List<ProcessInstance> findProcessInstanceByNativeQuery(Map<String, Object> parameterMap, int firstResult, int maxResults) {
        return Collections.emptyList();
    }

    @Override
    public long findProcessInstanceCountByQueryCriteria(ProcessInstanceQueryImpl executionQuery) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long findExecutionCountByNativeQuery(Map<String, Object> parameterMap) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void updateExecutionTenantIdForDeployment(String deploymentId, String newTenantId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void updateProcessInstanceLockTime(String processInstanceId, Date lockDate, Date expirationTime) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void updateAllExecutionRelatedEntityCountFlags(boolean newValue) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clearProcessInstanceLockTime(String processInstanceId) {
        throw new UnsupportedOperationException();
    }
}