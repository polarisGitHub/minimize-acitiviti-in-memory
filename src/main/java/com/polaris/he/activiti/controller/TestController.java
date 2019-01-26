package com.polaris.he.activiti.controller;

import com.polaris.he.activiti.memory.DataManagerHolder;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * User: hexie
 * Date: 2019-01-26 12:41
 * Description:
 */

@RestController
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Resource
    private RepositoryService repositoryService;

    @Resource
    private RuntimeService runtimeService;

    @GetMapping("/deploy")
    public String deploy() {
        repositoryService.createDeployment().name("demo").addClasspathResource("demo.bpmn").deploy();
        return "ok";
    }

    @GetMapping("/start")
    public String start() {
        int loops = 10;
        Map<String, Object> variables = Map.of("start_param", "start");
        long start = System.currentTimeMillis();
        for (int i = 0; i < loops; i++) {
            DataManagerHolder.prepareStart();
            ProcessInstance pi = runtimeService.startProcessInstanceById("demo:23:427503", variables);
        }
        long end = System.currentTimeMillis();
        LOGGER.info("----------- {}", end - start);
        return "ok";
    }
}