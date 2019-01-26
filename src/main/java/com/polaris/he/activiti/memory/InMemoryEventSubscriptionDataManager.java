package com.polaris.he.activiti.memory;

import org.activiti.engine.impl.EventSubscriptionQueryImpl;
import org.activiti.engine.impl.Page;
import org.activiti.engine.impl.persistence.entity.*;
import org.activiti.engine.impl.persistence.entity.data.EventSubscriptionDataManager;

import java.util.Collections;
import java.util.List;

/**
 * User: hexie
 * Date: 2019-01-26 12:23
 * Description:
 */
public class InMemoryEventSubscriptionDataManager extends AbstractInMemoryDataManager<EventSubscriptionEntity> implements EventSubscriptionDataManager {
    @Override
    public Class<? extends EventSubscriptionEntity> getManagedEntityClass() {
        return EventSubscriptionEntityImpl.class;
    }

    @Override
    public MessageEventSubscriptionEntity createMessageEventSubscription() {
        return null;
    }

    @Override
    public SignalEventSubscriptionEntity createSignalEventSubscription() {
        return null;
    }

    @Override
    public CompensateEventSubscriptionEntity createCompensateEventSubscription() {
        return null;
    }

    @Override
    public long findEventSubscriptionCountByQueryCriteria(EventSubscriptionQueryImpl eventSubscriptionQueryImpl) {
        return 0;
    }

    @Override
    public List<EventSubscriptionEntity> findEventSubscriptionsByQueryCriteria(EventSubscriptionQueryImpl eventSubscriptionQueryImpl, Page page) {
        return Collections.emptyList();
    }

    @Override
    public List<MessageEventSubscriptionEntity> findMessageEventSubscriptionsByProcessInstanceAndEventName(String processInstanceId, String eventName) {
        return Collections.emptyList();
    }

    @Override
    public List<SignalEventSubscriptionEntity> findSignalEventSubscriptionsByEventName(String eventName, String tenantId) {
        return null;
    }

    @Override
    public List<SignalEventSubscriptionEntity> findSignalEventSubscriptionsByProcessInstanceAndEventName(String processInstanceId, String eventName) {
        return Collections.emptyList();
    }

    @Override
    public List<SignalEventSubscriptionEntity> findSignalEventSubscriptionsByNameAndExecution(String name, String executionId) {
        return Collections.emptyList();
    }

    @Override
    public List<EventSubscriptionEntity> findEventSubscriptionsByExecutionAndType(String executionId, String type) {
        return Collections.emptyList();
    }

    @Override
    public List<EventSubscriptionEntity> findEventSubscriptionsByProcessInstanceAndActivityId(String processInstanceId, String activityId, String type) {
        return Collections.emptyList();
    }

    @Override
    public List<EventSubscriptionEntity> findEventSubscriptionsByExecution(String executionId) {
        return Collections.emptyList();
    }

    @Override
    public List<EventSubscriptionEntity> findEventSubscriptionsByTypeAndProcessDefinitionId(String type, String processDefinitionId, String tenantId) {
        return Collections.emptyList();
    }

    @Override
    public List<EventSubscriptionEntity> findEventSubscriptionsByName(String type, String eventName, String tenantId) {
        return Collections.emptyList();
    }

    @Override
    public List<EventSubscriptionEntity> findEventSubscriptionsByNameAndExecution(String type, String eventName, String executionId) {
        return Collections.emptyList();
    }

    @Override
    public MessageEventSubscriptionEntity findMessageStartEventSubscriptionByName(String messageName, String tenantId) {
        return null;
    }

    @Override
    public void updateEventSubscriptionTenantId(String oldTenantId, String newTenantId) {

    }

    @Override
    public void deleteEventSubscriptionsForProcessDefinition(String processDefinitionId) {

    }

    @Override
    public EventSubscriptionEntity create() {
        throw new UnsupportedOperationException();
    }
}