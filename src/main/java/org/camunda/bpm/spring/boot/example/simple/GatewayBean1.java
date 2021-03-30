package org.camunda.bpm.spring.boot.example.simple;

import org.camunda.bpm.engine.delegate.Expression;
import org.camunda.bpm.engine.delegate.VariableScope;
import org.springframework.stereotype.Component;

@Component("path1")
public class GatewayBean1 implements Expression {

    @Override
    public Object getValue(VariableScope variableScope) {
        return true;
    }

    @Override
    public void setValue(Object value, VariableScope variableScope) {

    }

    @Override
    public String getExpressionText() {
        return null;
    }

    @Override
    public boolean isLiteralText() {
        return false;
    }
}
