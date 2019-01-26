package com.polaris.he.activiti.memory;

import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.TimerJobQueryImpl;
import org.activiti.engine.impl.persistence.entity.TimerJobEntity;
import org.activiti.engine.impl.persistence.entity.TimerJobEntityImpl;
import org.activiti.engine.impl.persistence.entity.data.TimerJobDataManager;
import org.activiti.engine.runtime.Job;

import java.util.Collections;
import java.util.List;

/**
 * User: hexie
 * Date: 2019-01-26 12:27
 * Description:
 */
public class InMemoryTimerJobDataManager extends AbstractInMemoryDataManager<TimerJobEntity> implements TimerJobDataManager {
    @Override
    public Class<? extends TimerJobEntity> getManagedEntityClass() {
        return TimerJobEntityImpl.class;
    }

    @Override
    public List<TimerJobEntity> findTimerJobsToExecute(Page page) {
        return Collections.emptyList();
    }

    @Override
    public List<TimerJobEntity> findJobsByTypeAndProcessDefinitionId(String jobHandlerType, String processDefinitionId) {
        return Collections.emptyList();
    }

    @Override
    public List<TimerJobEntity> findJobsByTypeAndProcessDefinitionKeyNoTenantId(String jobHandlerType, String processDefinitionKey) {
        return Collections.emptyList();
    }

    @Override
    public List<TimerJobEntity> findJobsByTypeAndProcessDefinitionKeyAndTenantId(String jobHandlerType, String processDefinitionKey, String tenantId) {
        return Collections.emptyList();
    }

    @Override
    public List<TimerJobEntity> findJobsByExecutionId(String executionId) {
        return Collections.emptyList();
    }

    @Override
    public List<TimerJobEntity> findJobsByProcessInstanceId(String processInstanceId) {
        return Collections.emptyList();
    }

    @Override
    public List<Job> findJobsByQueryCriteria(TimerJobQueryImpl jobQuery, Page page) {
        return Collections.emptyList();
    }

    @Override
    public long findJobCountByQueryCriteria(TimerJobQueryImpl jobQuery) {
        return 0;
    }

    @Override
    public void updateJobTenantIdForDeployment(String deploymentId, String newTenantId) {

    }

    @Override
    public TimerJobEntity create() {
        return new TimerJobEntityImpl();
    }
}