package com.polaris.he.activiti.listener;

import org.activiti.engine.delegate.event.ActivitiEvent;
import org.activiti.engine.delegate.event.ActivitiEventListener;
import org.activiti.engine.delegate.event.ActivitiEventType;
import org.activiti.engine.delegate.event.impl.ActivitiEntityEventImpl;
import org.activiti.engine.impl.persistence.entity.HistoricActivityInstanceEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 记录流转路径
 *
 * User: hexie
 * Date: 2019-02-04 16:34
 * Description:
 */
public class FlowListener implements ActivitiEventListener {

    private Logger LOGGER = LoggerFactory.getLogger(FlowListener.class);

    @Override
    public void onEvent(ActivitiEvent event) {
        if (event.getType() == ActivitiEventType.HISTORIC_ACTIVITY_INSTANCE_CREATED) {
            ActivitiEntityEventImpl e = (ActivitiEntityEventImpl) event;
            LOGGER.info("activityId={},activityName={}", ((HistoricActivityInstanceEntity) e.getEntity()).getActivityId(), ((HistoricActivityInstanceEntity) e.getEntity()).getActivityName());
        }
    }

    @Override
    public boolean isFailOnException() {
        return false;
    }
}