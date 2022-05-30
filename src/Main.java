import mathematics.*;
import mathematics.Number;

public class Main {
    public static void main(String[] args) {
        //123+3+9
        Node node = new Add(new Number(123L), new Add(new Number(3L), new Number(9L)));
        Node node1 = new Add(new Add(new Number(123L), new Number(3L)), new Number(9L));
        System.out.println(new EvalExpressionVisitor().visitNode(node));
        System.out.println(new EvalExpressionVisitor().visitNode(node1));

        //1+2*3
        Node node2 = new Add(new Number(1L), new Multiply(new Number(2L), new Number(3L)));
        //(1+2)*3
        Node node3 = new Multiply(new Add(new Number(1L), new Number(2L)), new Number(3L));
    }
}
