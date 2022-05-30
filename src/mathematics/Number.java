package mathematics;

public class Number extends Node {
    private final Double number;

    public Number(Double number) {
        super(ENodeType.NUMBER);
        this.number = number;
    }

    public Double getNumber() {
        return number;
    }
}
