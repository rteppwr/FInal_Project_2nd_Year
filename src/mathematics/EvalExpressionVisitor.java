package mathematics;

public class EvalExpressionVisitor {
    public double visitNode(Node node) {
        switch (node.getNodeType()) {
            case NUMBER: return visitNumber((Number) node);
            case ADD: return visitAdd((Add) node);
            case SUBTRACT: return visitSubtract((Subtract) node);
            case MULTIPLY: return visitMultiply((Multiply) node);
            case DIVIDE: return visitDivide((Divide) node);
            case SIN: return visitSin((Sin) node);
        }
        throw new RuntimeException("error");
    }

    private double visitNumber(Number number) {
        return number.getNumber();
    }

    private double visitAdd(Add add) {
        return visitNode(add.getLeft()) + visitNode(add.getRight());
    }

    private double visitSubtract(Subtract subtract) {
        return visitNode(subtract.getLeft()) - visitNode(subtract.getRight());
    }
    private double visitMultiply(Multiply multiply) {
        return visitNode(multiply.getLeft()) * visitNode(multiply.getRight());
    }

    private double visitDivide(Divide divide) {
        return visitNode(divide.getLeft()) / visitNode(divide.getRight());
    }

    private double visitSin(Sin sin) {
        return Math.sin(Math.toRadians(visitNode(sin.getOperand())));
    }

}
