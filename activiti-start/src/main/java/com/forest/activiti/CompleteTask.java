package com.forest.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.TaskService;

/**
 * @author dongyang
 * @date 2020年04月27日 20:14
 */
public class CompleteTask {
    public static void main(String[] args) {
        ProcessEngine processEngine = ProcessEngineConfiguration.createProcessEngineConfigurationFromResourceDefault().buildProcessEngine();
        TaskService taskService = processEngine.getTaskService();
        taskService.complete("2505");
    }
}
