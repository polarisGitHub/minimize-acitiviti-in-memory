package com.polaris.he.activiti;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

/**
 * User: hexie
 * Date: 2019-01-25 22:32
 * Description:
 */
public class ServiceTaskImpl implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
        Object param = execution.getVariable("start_param");
        execution.setVariable("end_param","true");
    }
}