package OOP.lab4;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ParenthesisChecker checker = new ParenthesisChecker();
        List<String> expressions = Reader.readFile("C:/Users/marga/OOP/src/OOP/lab4/three_expressions");

        expressions.forEach(expression -> System.out.println(
                "Is " +
                        (checker.isBalanced(expression) ? "" : "not") +
                        " Balanced"));
    }
}






