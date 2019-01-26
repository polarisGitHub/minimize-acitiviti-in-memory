package com.polaris.he.activiti.engine;

import com.polaris.he.activiti.memory.*;
import org.activiti.engine.ActivitiException;
import org.activiti.engine.impl.cfg.CommandExecutorImpl;
import org.activiti.engine.impl.interceptor.CommandInterceptor;
import org.activiti.engine.impl.interceptor.TransactionContextInterceptor;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.activiti.spring.SpringTransactionInterceptor;

import java.util.LinkedList;
import java.util.List;

/**
 * User: hexie
 * Date: 2019-01-26 13:08
 * Description:
 */
public class InMemorySpringProcessEngineConfiguration extends SpringProcessEngineConfiguration {

    @Override
    public void initCommandExecutor() {
        super.initCommandExecutor();
        List<CommandInterceptor> list = new LinkedList<>();
        CommandInterceptor interceptor = ((CommandExecutorImpl) commandExecutor).getFirst();
        do {
            if (!(interceptor instanceof SpringTransactionInterceptor) && !(interceptor instanceof TransactionContextInterceptor)) {
                list.add(interceptor);
            }
            interceptor = interceptor.getNext();
        } while (interceptor != null);
        ((CommandExecutorImpl) commandExecutor).setFirst(initInterceptorChain(list));
    }

    public CommandInterceptor initInterceptorChain(List<CommandInterceptor> chain) {
        if (chain == null || chain.isEmpty()) {
            throw new ActivitiException("invalid command interceptor chain configuration: " + chain);
        }
        for (int i = 0; i < chain.size() - 1; i++) {
            chain.get(i).setNext(chain.get(i + 1));
        }
        return chain.get(0);
    }

    @Override
    public void initDataManagers() {
        super.initDataManagers();
        processDefinitionDataManager = new CachedMybatisProcessDefinitionDataManager(this);
        taskDataManager = new InMemoryTaskInMemoryDataManager();
        executionDataManager = new InMemoryExecutionInMemoryDataManager();
        eventSubscriptionDataManager = new InMemoryEventSubscriptionDataManager();
        timerJobDataManager = new InMemoryTimerJobDataManager();
    }
}