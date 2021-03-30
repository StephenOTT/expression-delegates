package org.camunda.bpm.spring.boot.example.simple;

import org.camunda.bpm.engine.delegate.Expression;
import org.camunda.bpm.engine.delegate.VariableScope;
import org.springframework.stereotype.Component;

@Component("path2")
public class GatewayBean2 implements Expression {

    @Override
    public Object getValue(VariableScope variableScope) {
        return false;
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
