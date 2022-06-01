package parser;

import mathematics.*;
import mathematics.Number;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public Node parse(String expression) {
        List<Object> tokens = getTokens("(" + expression + ")");
        Stack<String> operatorStack = new Stack<>();
        Stack<Node> expressionStack = new Stack<>();
        for (Object o : tokens) {
            input(o, operatorStack, expressionStack);
        }
        if (expressionStack.size() != 1 || !operatorStack.isEmpty()) {
            throw new RuntimeException("END");
        }
        return expressionStack.pop();
    }

    private List<Object> getTokens(String expression) {
        List<Object> tokens = new ArrayList<>();
        final Matcher matcher = Pattern.compile("(?<number>[\\d\\.]+)|(?<symbol>[\\+\\-\\*\\/\\(\\)])").matcher(expression);
        while (matcher.find()) {
            if (matcher.group("number") != null) {
                tokens.add(Double.parseDouble(matcher.group("number")));
            } else {
                tokens.add(matcher.group("symbol"));
            }
        }
        return tokens;
    }

    private void input(Object token, Stack<String> operatorStack, Stack<Node> expressionStack) {
        String c = token.toString();
        if (token instanceof Double) {
            expressionStack.push(new Number((Double) token));
        } else if (c.equals("(")) {
            operatorStack.add(c);
        } else if (c.matches("[\\+\\-\\*\\/]")) {
            while (!operatorStack.isEmpty()) {
                String peek = operatorStack.peek();
                if (peek.equals("(") || ((peek.equals("+") || peek.equals("-")) && (c.equals("*") || c.equals("/")))) {
                    break;
                }
                String pop = operatorStack.pop();
                Node n2 = expressionStack.pop();
                Node n1 = expressionStack.pop();
                expressionStack.push(getBinaryOperation(n1, n2, pop));
            }
            operatorStack.add(c);
        } else if (c.equals(")")) {
            while (!operatorStack.isEmpty()) {
                String peek = operatorStack.peek();
                if (peek.equals("(")) {
                    break;
                }
                String pop = operatorStack.pop();
                Node n2 = expressionStack.pop();
                Node n1 = expressionStack.pop();
                expressionStack.push(getBinaryOperation(n1, n2, pop));
            }
            operatorStack.pop();

        } else {
            throw new RuntimeException(c);
        }
    }

    private Node getBinaryOperation(Node left, Node right, String operation) {
        if ("+".equals(operation)) {
            return new Add(left, right);
        } else if ("-".equals(operation)) {
            return new Subtract(left, right);
        } else if ("*".equals(operation)) {
            return new Multiply(left, right);
        } else if ("/".equals(operation)) {
            return new Divide(left, right);
        }
        throw new RuntimeException("Unknown operation" + operation);
    }
}
