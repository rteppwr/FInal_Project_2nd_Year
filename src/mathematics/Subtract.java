package mathematics;

public class Subtract extends BinaryOperation {
    public Subtract(Node left, Node right) {
        super(ENodeType.SUBTRACT, left, right);
    }
}
