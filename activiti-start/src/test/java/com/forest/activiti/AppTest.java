package com.forest.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    /**
     *
     * 
     * @param 
     * @return 
     * @author dongyang
     * @date 2020/4/27 19:31
    */
    @Test
    public void deployProcess() {
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createProcessEngineConfigurationFromResourceDefault();
        ProcessEngine processEngine = configuration.buildProcessEngine();
        RepositoryService repositoryService = processEngine.getRepositoryService();
        Deployment deploy = repositoryService.createDeployment().addClasspathResource("process/test.bpmn").addClasspathResource("process/test.png").name("测试").deploy();
        System.err.println(deploy.getId());
        System.err.println(deploy.getName());
    }

    @Test
    public void startProcess() {
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createProcessEngineConfigurationFromResourceDefault();
        ProcessEngine processEngine = configuration.buildProcessEngine();
        RuntimeService runtimeService = processEngine.getRuntimeService();
        ProcessInstance processInstance = runtimeService.startProcessInstanceById("myProcess_1:1:3");
        System.err.println(processInstance.getProcessDefinitionId());
        System.err.println(processInstance.getId());
        System.err.println(processInstance.getActivityId());
    }
}
