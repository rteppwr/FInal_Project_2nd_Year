package mathematics;

/**
 * Třída BinaryOperation je potomkem třídy Node a reprezentuje binární operaci v matematickém výrazu.
 */
public class BinaryOperation extends Node {
    private final Node left;
    private final Node right;

    /**
     * Konstruktor třídy BinaryOperation inicializuje typ uzlu a přiřazuje levý a pravý podstrom.
     *
     * @param nodeType typ uzlu
     * @param left levý podstrom
     * @param right pravý podstrom
     */
    public BinaryOperation(ENodeType nodeType, Node left, Node right) {
        super(nodeType);
        this.left = left;
        this.right = right;
    }

    /**
     * Metoda getLeft vrací levý podstrom.
     *
     * @return levý podstrom
     */
    public Node getLeft() {
        return left;
    }

    /**
     * Metoda getRight vrací pravý podstrom.
     *
     * @return pravý podstrom
     */
    public Node getRight() {
        return right;
    }
}
