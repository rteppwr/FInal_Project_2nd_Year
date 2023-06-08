package mathematics;

/**
 * Třída Cos je potomkem třídy UnaryOperation a reprezentuje kosinus v matematickém výrazu.
 */
public class Cos extends UnaryOperation {

    /**
     * Konstruktor třídy Cos inicializuje operátor pro výpočet kosinu.
     *
     * @param operand operátor
     */
    public Cos(Node operand) {
        super(ENodeType.COS, operand);
    }
}
