package mathematics;

public class BinaryOperation extends Node {
    private final Node left;
    private final Node right;

    public BinaryOperation(ENodeType nodeType, Node left, Node right) {
        super(nodeType);
        this.left = left;
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
