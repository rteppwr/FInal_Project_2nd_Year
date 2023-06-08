package mathematics;

/**
 * Třída Divide je potomkem třídy BinaryOperation a reprezentuje dělení v matematickém výrazu.
 */
public class Divide extends BinaryOperation {

    /**
     * Konstruktor třídy Divide inicializuje levý a pravý podstrom pro dělení.
     *
     * @param left levý podstrom
     * @param right pravý podstrom
     */
    public Divide(Node left, Node right) {
        super(ENodeType.DIVIDE, left, right);
    }
}
