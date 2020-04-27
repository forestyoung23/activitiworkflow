package com.forest.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.task.Task;

import java.util.List;

/**
 * 任务查询
 *
 * @author dongyang
 * @date 2020年04月27日 20:10
 */
public class TaskQuery {

    public static void main(String[] args) {
        ProcessEngine processEngine = ProcessEngineConfiguration.createProcessEngineConfigurationFromResourceDefault().buildProcessEngine();
        List<Task> list = processEngine.getTaskService().createTaskQuery().processDefinitionKey("test").taskAssignee("zhangsan").list();
        for (Task task : list) {
            System.err.println(task.getAssignee());
            System.err.println(task.getTaskDefinitionKey());
            System.err.println(task.getId());
            System.err.println(task.getName());
        }
    }
}
