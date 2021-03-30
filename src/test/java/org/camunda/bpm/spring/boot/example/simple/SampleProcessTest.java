package org.camunda.bpm.spring.boot.example.simple;

import org.assertj.core.api.Assertions;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.test.assertions.bpmn.BpmnAwareTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import static org.camunda.bpm.engine.test.assertions.bpmn.BpmnAwareTests.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class SampleProcessTest {

  @Autowired ProcessEngine processEngine;

  @Test
  public void test1() {
    ProcessInstance instance = processEngine.getRuntimeService().startProcessInstanceByKey("Sample");
    assertThat(instance).isEnded();
    //org.camunda.bpm.engine.ProcessEngineException: condition expression returns non-Boolean: result has class org.camunda.bpm.spring.boot.example.simple.GatewayBean2 and not java.lang.Boolean
  }


  @Test
  public void test2() {
    ProcessInstance instance = processEngine.getRuntimeService().startProcessInstanceByKey("Sample2");
    assertThat(instance).isWaitingAt("Activity_0odbxmw");
    //java.lang.ClassCastException: class org.camunda.bpm.spring.boot.example.simple.AssigneeExpression cannot be cast to class java.lang.String (org.camunda.bpm.spring.boot.example.simple.AssigneeExpression is in unnamed module of loader 'app'; java.lang.String is in module java.base of loader 'bootstrap')

  }

}
