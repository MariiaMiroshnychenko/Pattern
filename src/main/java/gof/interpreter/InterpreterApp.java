package gof.interpreter;

import gof.interpreter.context.Context;
import gof.interpreter.entity.Expression;

public class InterpreterApp {
    public static void main(String[] args) {
        Context context = new Context();

        Expression expression = context.evaluate("1+1-3");
        System.out.println(expression.interpret());
    }
}
