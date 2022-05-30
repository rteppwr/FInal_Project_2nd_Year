package mathematics;

public class Add implements Node {
    private final Node left;
    private final Node right;

    public Add(Node left, Node right) {
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
