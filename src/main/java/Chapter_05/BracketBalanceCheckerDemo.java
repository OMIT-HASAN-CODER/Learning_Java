package Chapter_05;

class BracketBalanceChecker {

    public boolean isBalanced(String input) {
        if (input.length() % 2 == 1) {
            return false;
        }

        CharStack stack = new CharStack();
        for (char c : input.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else if ((c == ')') && (stack.pop() != '(')) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

public class BracketBalanceCheckerDemo {
    public static void main(String[] args) {
        String[] brackets = {
                "()",
                "()))",
                "((()",
                "((()))",
                "((())))"
        };

        BracketBalanceChecker checker = new BracketBalanceChecker();

        for (String bracket : brackets) {
            if (checker.isBalanced(bracket)) {
                System.out.println(bracket + " is balanced");
            } else {
                System.out.println(bracket + " is not balanced");
            }
        }
    }
}
