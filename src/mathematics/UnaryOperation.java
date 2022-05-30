package mathematics;

public class UnaryOperation extends Node{
    private final Node operand;

    public Node getOperand() {
        return operand;
    }

    public UnaryOperation(ENodeType nodeType, Node operand) {
        super(nodeType);
        this.operand = operand;
    }
}
