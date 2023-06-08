package mathematics;

/**
 * Abstraktní třída Node je základní třídou pro reprezentaci uzlů v matematickém výrazu.
 */
public abstract class Node {
    private final ENodeType nodeType;

    /**
     * Konstruktor třídy Node inicializuje typ uzlu.
     *
     * @param nodeType typ uzlu
     */
    public Node(ENodeType nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * Metoda getNodeType vrací typ uzlu.
     *
     * @return typ uzlu
     */
    public ENodeType getNodeType() {
        return nodeType;
    }
}
