package cn.cincout.distribute.spring.basic.spel;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Created by zhaoyu on 18-8-22.
 *
 * @author zhaoyu
 * @sine 1.8
 */
public class SpELSample {
    public static void main(String[] args) {
        ExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("'Hello World'.concat('!')");

        String message = (String) expression.getValue();
        System.out.println(message);
    }
}
