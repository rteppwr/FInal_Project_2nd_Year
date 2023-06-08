package graphics;

import mathematics.EvalExpressionVisitor;
import mathematics.Node;
import parser.Parser;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Třída Graphics slouží k implementaci grafického uživatelského rozhraní pro interakci s matematickými výrazy.
 */
public class Graphics {

    private JPanel panel;
    private JTextArea textField1;
    private JButton sinButton;
    private JButton cosButton;
    private JButton tgButton;
    private JButton cotgButton;
    private JButton oneButton;
    private JButton fourButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton multiplyButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton minusButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton plusButton;
    private JButton equalsButton;
    private JButton zeroButton;
    private JButton decimalButton;
    private JButton divideButton;
    private JButton clearAllButton;
    private JButton deleteCharButton;
    private JButton leftBracketButton;
    private JButton rightBracketButton;
    private JLabel errorMessage;

    private boolean clear = false;

    /**
     * Konstruktor třídy Graphics inicializuje komponenty uživatelského rozhraní a přiřazuje jim odpovídající akční metody.
     */
    public Graphics() {
        zeroButton.addActionListener(createActionListener("0"));
        oneButton.addActionListener(createActionListener("1"));
        twoButton.addActionListener(createActionListener("2"));
        threeButton.addActionListener(createActionListener("3"));
        fourButton.addActionListener(createActionListener("4"));
        fiveButton.addActionListener(createActionListener("5"));
        sixButton.addActionListener(createActionListener("6"));
        sevenButton.addActionListener(createActionListener("7"));
        eightButton.addActionListener(createActionListener("8"));
        nineButton.addActionListener(createActionListener("9"));
        plusButton.addActionListener(createActionListener("+"));
        minusButton.addActionListener(createActionListener("-"));
        divideButton.addActionListener(createActionListener("/"));
        multiplyButton.addActionListener(createActionListener("*"));
        decimalButton.addActionListener(createActionListener("."));
        leftBracketButton.addActionListener(createActionListener("("));
        rightBracketButton.addActionListener(createActionListener(")"));

        sinButton.addActionListener(createActionListener("sin("));
        cosButton.addActionListener(createActionListener("cos("));
        tgButton.addActionListener(createActionListener("tg("));
        cotgButton.addActionListener(createActionListener("cotg("));

        equalsButton.addActionListener(e -> {
            try {
                clear = true;
                Node parse = new Parser().parse(textField1.getText());
                double v = new EvalExpressionVisitor().visitNode(parse);
                textField1.setText(String.valueOf(v));
            } catch (Exception ex) {
                errorMessage.setText("Chyba ve výrazu");
            }
        });

        clearAllButton.addActionListener(e -> textField1.setText(""));

        deleteCharButton.addActionListener(e -> {
            String temp = textField1.getText();
            if (!temp.isEmpty()) {
                textField1.setText(temp.substring(0, temp.length() - 1));
            }
        });
    }

    private void createUIComponents() {
        // TODO: umístění vlastního kódu pro vytváření komponent zde
    }

    private ActionListener createActionListener(String symbol) {
        return e -> {
            if (clear) {
                textField1.setText("");
                clear = false;
            }
            textField1.setText(textField1.getText() + symbol);
            errorMessage.setText("");
        };
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setContentPane(new Graphics().panel);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
