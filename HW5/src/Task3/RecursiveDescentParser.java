package Task3;

import java.util.Arrays;
import java.util.List;

/**
 * Expr -> Term + Expr | Term - Expr | Term
 * Term -> Factor * Term | Factor / Term | Factor
 * Factor -> Number | (Expr) | func(Expr)
 * <p>
 * 2 + 2 - 3
 * 2 + 3 * ( 4 + 5 ) - 6 * 7 + sin(10) + cos(12 + 1)
 */
public class RecursiveDescentParser {

    private final List<String> tokens;
    private int pos = 0;

    public RecursiveDescentParser(List<String> tokens) {
        this.tokens = tokens;
    }

    public Double parse() {
        return expression();
    }

    private Double expression() {
        Double first = term();

        while (pos < tokens.size()) {
            String operator = tokens.get(pos);

            if (!operator.equals("+") && !operator.equals("-")) {
                break;
            } else {
                pos++;
            }

            Double second = term();
            if (operator.equals("+")) {
                first += second;
            } else {
                first -= second;
            }
        }
        return first;
    }

    private Double term() {
        Double first = factor();

        while (pos < tokens.size()) {
            String operator = tokens.get(pos);
            if (!operator.equals("*") && !operator.equals("/")) {
                return first;
            } else {
                pos++;
            }

            Double second = factor();
            if (operator.equals("*")) {
                first *= second;
            } else {
                first /= second;
            }
        }
        return first;
    }

    private Double factor() {
        String next = tokens.get(pos);
        Double result;
        if (next.equals("(")) {
            pos++;
            result = expression();
            String closingBracket = null;
            if (pos < tokens.size() && (closingBracket = tokens.get(pos)).equals(")")) {
                pos++;
                return result;
            }
            throw new IllegalStateException("')' expected but " + closingBracket);
        }
        if (next.equals("sin")) {
            pos++;
            return Math.sin(factor());
        }
        if (next.equals("cos")) {
            pos++;
            return Math.cos(factor());
        }
        if (next.equals("tg")) {
            pos++;
            return Math.tan(factor());
        }
        if (next.equals("ctg")) {
            pos++;
            return 1 / Math.tan(factor());
        }
        if (next.equals("ln")) {
            pos++;
            return Math.log(factor());
        }
        pos++;
        return Double.parseDouble(next);
    }

    public static void main(String[] args) {
        String expr = "2.111 * 3.5 + ( 3 + 4 * ( 2.1 + 3 ) - 10 ) * ( 5 - 7 + 4 - 2 ) + 11";
        String funcExp = "5 + 2.5 + sin ( 10 - 5 * 2 ) - ln ( 10 / ( 5 + 15 ) )";
        RecursiveDescentParser recursiveDescentParser = new RecursiveDescentParser(Arrays.asList(expr.split(" ")));
        RecursiveDescentParser recursiveFuncDescentParser = new RecursiveDescentParser(Arrays.asList(funcExp.split(" ")));
        System.out.println(recursiveDescentParser.parse());
        System.out.println(2.111 * 3.5 + (3 + 4 * (2.1 + 3) - 10) * (5 - 7 + 4 - 2) + 11);
        System.out.println(recursiveFuncDescentParser.parse());
        System.out.println(5 + 2.5 + Math.sin(10 - 5 * 2) - Math.log(10.0 / (5 + 15)));
    }
}
