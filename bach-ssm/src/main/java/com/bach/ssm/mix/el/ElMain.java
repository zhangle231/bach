package com.bach.ssm.mix.el;

import com.bach.ssm.annotation.pojo.Role;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElMain {
    public static void main(String[] args) {
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression exp = parser.parseExpression("'hello'");
        String str = (String) exp.getValue();
        System.out.println(str);

        //通过el访问普通方法
        exp = parser.parseExpression("'hello'.charAt(0)");
        char ch = (Character) exp.getValue();
        System.out.println(ch);

        //通过el访问get方法
        exp = parser.parseExpression("'hello'.bytes");
        byte[] bytes = (byte[]) exp.getValue();
        System.out.println(Arrays.toString(bytes));

        //通过el方法属性
        exp = parser.parseExpression("'hello'.bytes.length");
        int length = (Integer) exp.getValue();
        System.out.println(length);

        //对象中使用el表达式
        Role role = new Role();
        role.setId(1l);
        role.setRoleName("role-name-el");
        exp = parser.parseExpression("roleName");
        String name = (String) exp.getValue(role);
        System.out.println(name);
        //变量解析
        EvaluationContext ctx = new StandardEvaluationContext(role);
        parser.parseExpression("note").setValue(ctx, "new_note");
        System.out.println(role);
        String note = parser.parseExpression("note").getValue(ctx, String.class);
        System.out.println(note);
        //使用方法
        String roleName = parser.parseExpression("getRoleName()").getValue(ctx, String.class);
        System.out.println(roleName);

        //新增环境变量
        List<String> list = new ArrayList<>();
        list.add("value1");
        list.add("value2");

        ctx.setVariable("list", list);

        parser.parseExpression("#list[1]").setValue(ctx, "update_value2");
        System.out.println(list);
        Object value = parser.parseExpression("#list[1]").getValue(ctx);
        System.out.println(value);

    }
}
