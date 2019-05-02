package gof.interpreter.context;

import gof.interpreter.entity.Expression;
import gof.interpreter.non.terminal.MinusExpression;
import gof.interpreter.non.terminal.NumberExpression;
import gof.interpreter.non.terminal.PlusExpression;

public class Context {
    public Expression evaluate(String string) {
        int position = string.length() - 1;

        while (position > 0) {
            if (Character.isDigit(string.charAt(position))) {
                position--;
            } else {
                Expression left = evaluate(string.substring(0, position));
                Expression right = new NumberExpression(Integer.valueOf(string.substring(position + 1, string.length())));

                char operator = string.charAt(position);
                switch (operator) {
                    case '-':
                        return new MinusExpression(left, right);
                    case '+':
                        return new PlusExpression(left, right);
                }
            }
        }
        int result = Integer.valueOf(string);
        return new NumberExpression(result);
    }
}
