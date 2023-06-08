package mathematics;

/**
 * Třída Multiply je potomkem třídy BinaryOperation a reprezentuje násobení v matematickém výrazu.
 */
public class Multiply extends BinaryOperation {

    /**
     * Konstruktor třídy Multiply inicializuje levý a pravý podstrom pro násobení.
     *
     * @param left levý podstrom
     * @param right pravý podstrom
     */
    public Multiply(Node left, Node right) {
        super(ENodeType.MULTIPLY, left, right);
    }
}
