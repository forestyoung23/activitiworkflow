package com.forest.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;

/**
 * 开始流程
 *
 * @author dongyang
 * @date 2020年04月27日 19:48
 */
public class StartProcess {

    /**
     * 相关表
     * act_ru_task(运行时任务)
     * act_ru_identitylink(运行时用户关系信息)
     * act_ru_execution(运行时流程执行实例)
     * act_hi_taskinst(历史的任务实例)
     * act_hi_procinst(历史的流程实例)
     * act_hi_identitylink(历史的流程运行过程中用户关系)
     * act_hi_actinst(历史的流程实例)
     *
     * @param
     * @return
     * @author dongyang
     * @date 2020/4/27 19:32
     */
    public static void main(String[] args) {
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createProcessEngineConfigurationFromResourceDefault();
        ProcessEngine processEngine = configuration.buildProcessEngine();
        RuntimeService runtimeService = processEngine.getRuntimeService();
        ProcessInstance instance = runtimeService.startProcessInstanceByKey("test");
        System.err.println(instance.getName());
        System.err.println(instance.getProcessDefinitionId());
        System.err.println(instance.getBusinessKey());
    }
}
