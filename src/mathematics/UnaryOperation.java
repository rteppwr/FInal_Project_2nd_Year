package mathematics;

/**
 * Třída UnaryOperation je potomkem třídy Node a reprezentuje unární operaci v matematickém výrazu.
 */
public class UnaryOperation extends Node {
    private final Node operand;

    /**
     * Konstruktor třídy UnaryOperation inicializuje typ uzlu a přiřazuje operátor.
     *
     * @param nodeType typ uzlu
     * @param operand operátor
     */
    public UnaryOperation(ENodeType nodeType, Node operand) {
        super(nodeType);
        this.operand = operand;
    }

    /**
     * Metoda getOperand vrací operátor.
     *
     * @return operátor
     */
    public Node getOperand() {
        return operand;
    }
}
