package com.polaris.he.activiti.memory;

import org.activiti.engine.impl.TaskQueryImpl;
import org.activiti.engine.impl.persistence.entity.ExecutionEntityImpl;
import org.activiti.engine.impl.persistence.entity.TaskEntity;
import org.activiti.engine.impl.persistence.entity.TaskEntityImpl;
import org.activiti.engine.impl.persistence.entity.data.TaskDataManager;
import org.activiti.engine.task.Task;

import java.util.List;
import java.util.Map;

/**
 * User: hexie
 * Date: 2019-01-26 10:18
 * Description:
 */
public class InMemoryTaskInMemoryDataManager extends AbstractInMemoryDataManager<TaskEntity> implements TaskDataManager {

    @Override
    public Class<? extends TaskEntity> getManagedEntityClass() {
        return TaskEntityImpl.class;
    }

    @Override
    public TaskEntity create() {
        return new TaskEntityImpl();
    }

    @Override
    public List<TaskEntity> findTasksByExecutionId(String executionId) {
        return ((ExecutionEntityImpl) getStorage(ExecutionEntityImpl.class).get(executionId)).getTasks();
    }

    @Override
    public List<TaskEntity> findTasksByProcessInstanceId(String processInstanceId) {
        return ((ExecutionEntityImpl) getStorage(ExecutionEntityImpl.class).get(processInstanceId)).getTasks();
    }

    @Override
    public List<Task> findTasksByQueryCriteria(TaskQueryImpl taskQuery) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Task> findTasksAndVariablesByQueryCriteria(TaskQueryImpl taskQuery) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long findTaskCountByQueryCriteria(TaskQueryImpl taskQuery) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Task> findTasksByNativeQuery(Map<String, Object> parameterMap, int firstResult, int maxResults) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long findTaskCountByNativeQuery(Map<String, Object> parameterMap) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Task> findTasksByParentTaskId(String parentTaskId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void updateTaskTenantIdForDeployment(String deploymentId, String newTenantId) {
        throw new UnsupportedOperationException();
    }
}