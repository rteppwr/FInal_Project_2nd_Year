package mathematics;

/**
 * Třída Subtract je potomkem třídy BinaryOperation a reprezentuje odčítání v matematickém výrazu.
 */
public class Subtract extends BinaryOperation {

    /**
     * Konstruktor třídy Subtract inicializuje levý a pravý podstrom pro odčítání.
     *
     * @param left levý podstrom
     * @param right pravý podstrom
     */
    public Subtract(Node left, Node right) {
        super(ENodeType.SUBTRACT, left, right);
    }
}
