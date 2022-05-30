package mathematics;

public abstract class Node {
    private final ENodeType nodeType;

    public Node(ENodeType nodeType) {
        this.nodeType = nodeType;
    }

    public ENodeType getNodeType() {
        return nodeType;
    }
}
