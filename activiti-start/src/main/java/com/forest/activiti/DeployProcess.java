package com.forest.activiti;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.repository.Deployment;

/**
 * 发布流程
 *
 * @author dongyang
 * @date 2020年04月27日 19:31
 */
public class DeployProcess {
    /**
     * 相关表
     * act_re_procdef(已部署的流程定义)
     * act_re_deployment(部署单元信息)
     * act_ge_bytearray(通用的流程定义和流程资源)
     *
     * @param
     * @return
     * @author dongyang
     * @date 2020/4/27 19:32
    */
    public static void main(String[] args) {
        ProcessEngineConfiguration configuration = ProcessEngineConfiguration.createProcessEngineConfigurationFromResourceDefault();
        ProcessEngine processEngine = configuration.buildProcessEngine();
        RepositoryService repositoryService = processEngine.getRepositoryService();
        Deployment deploy = repositoryService.createDeployment().addClasspathResource("process/test.bpmn").addClasspathResource("process/test.png").name("测试").deploy();
        System.err.println(deploy.getId());
        System.err.println(deploy.getName());
    }
}
