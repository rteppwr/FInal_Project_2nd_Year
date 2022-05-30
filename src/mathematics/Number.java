package mathematics;

public class Number implements Node {
    private final Long number;

    public Number(Long number) {
        this.number = number;
    }

    public Long getNumber() {
        return number;
    }
}
