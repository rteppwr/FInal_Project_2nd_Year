package mathematics;

/**
 * Třída Tg je potomkem třídy UnaryOperation a reprezentuje tangens v matematickém výrazu.
 */
public class Tg extends UnaryOperation {

    /**
     * Konstruktor třídy Tg inicializuje operátor pro výpočet tangensu.
     *
     * @param operand operátor
     */
    public Tg(Node operand) {
        super(ENodeType.TG, operand);
    }
}
