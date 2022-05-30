package mathematics;

public class EvalExpressionVisitor {
    public Long visitNode(Node node) {
        return switch (node.getClass()) {
            case Number.class -> visitNumber((Number) node);
            case Add.class -> visitAdd((Add) node);
            //case Multiply.class -> visitMultiply((Multiply) node);
        };
    }

    private Long visitNumber(Number number) {
        return number.getNumber();
    }

    private Long visitAdd(Add add) {
        return visitNode(add.getLeft()) + visitNode(add.getRight());
    }
}
