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
            case COS: return visitCos((Cos) node);
            case TG: return visitTg((Tg) node);
            case COTG: return visitCotg((Cotg) node);
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

    private double visitCos(Cos cos) {
        return Math.cos(Math.toRadians(visitNode(cos.getOperand())));
    }

    private double visitTg(Tg tg) {
        return Math.tan(Math.toRadians(visitNode(tg.getOperand())));
    }

    private double visitCotg(Cotg cotg) {
        return 1/Math.tan(Math.toRadians(visitNode(cotg.getOperand())));
    }

}
