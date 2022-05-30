package mathematics;

public class Multiply implements Node {
    private final Node left;
    private final Node right;

    public Multiply(Node left, Node right) {
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
