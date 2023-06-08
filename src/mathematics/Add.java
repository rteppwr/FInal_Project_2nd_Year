package mathematics;

/**
 * Třída Add je potomkem třídy BinaryOperation a reprezentuje sčítání v matematickém výrazu.
 */
public class Add extends BinaryOperation {

    /**
     * Konstruktor třídy Add inicializuje levý a pravý podstrom pro sčítání.
     *
     * @param left levý podstrom
     * @param right pravý podstrom
     */
    public Add(Node left, Node right) {
        super(ENodeType.ADD, left, right);
    }
}
