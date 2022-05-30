import mathematics.*;
import mathematics.Number;

public class Main {
    public static void main(String[] args) {
        //TODO Parser
        //TODO Graphics
        //TODO Sin, Cos, Tg, Cotg

        //123+3+9
        Node node = new Add(new Number(123.), new Add(new Number(3.), new Number(9.)));
        Node node1 = new Add(new Add(new Number(123.), new Number(3.)), new Number(9.));
        EvalExpressionVisitor evalExpressionVisitor = new EvalExpressionVisitor();
        System.out.println(evalExpressionVisitor.visitNode(node));
        System.out.println(evalExpressionVisitor.visitNode(node1));

        //1+2*3
        Node node2 = new Add(new Number(1.), new Multiply(new Number(2.), new Number(3.)));
        System.out.println(evalExpressionVisitor.visitNode(node2));
        //(1+2)*3
        Node node3 = new Multiply(new Add(new Number(1.), new Number(2.)), new Number(3.));
        System.out.println(evalExpressionVisitor.visitNode(node3));
        //1-2/3
        Node node4 = new Divide(new Subtract(new Number(1.), new Number(2.)), new Number(3.));
        System.out.println(evalExpressionVisitor.visitNode(node4));
        //sin(90)
        Node node5 = new Sin(new Number(90.));
        System.out.println(evalExpressionVisitor.visitNode(node5));
    }
}
