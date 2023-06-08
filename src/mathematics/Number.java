package mathematics;

/**
 * Třída Number je potomkem třídy Node a reprezentuje číselnou hodnotu v matematickém výrazu.
 */
public class Number extends Node {
    private final Double number;

    /**
     * Konstruktor třídy Number inicializuje číselnou hodnotu.
     *
     * @param number číselná hodnota
     */
    public Number(Double number) {
        super(ENodeType.NUMBER);
        this.number = number;
    }

    /**
     * Metoda getNumber vrací číselnou hodnotu.
     *
     * @return číselná hodnota
     */
    public Double getNumber() {
        return number;
    }
}
