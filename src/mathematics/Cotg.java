package mathematics;

/**
 * Třída Cotg je potomkem třídy UnaryOperation a reprezentuje cotangens v matematickém výrazu.
 */
public class Cotg extends UnaryOperation {

    /**
     * Konstruktor třídy Cotg inicializuje operátor pro výpočet cotangensu.
     *
     * @param operand operátor
     */
    public Cotg(Node operand) {
        super(ENodeType.COTG, operand);
    }
}
