package mathematics;

/**
 * Třída Sin je potomkem třídy UnaryOperation a reprezentuje sinus v matematickém výrazu.
 */
public class Sin extends UnaryOperation {

    /**
     * Konstruktor třídy Sin inicializuje operátor pro výpočet sinu.
     *
     * @param operand operátor
     */
    public Sin(Node operand) {
        super(ENodeType.SIN, operand);
    }
}
