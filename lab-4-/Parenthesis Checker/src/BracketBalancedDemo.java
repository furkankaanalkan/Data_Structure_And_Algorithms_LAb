public class BracketBalancedDemo {

    public static void main(String[] args) {

        String[] expressions = {
                "[{()}]",
                "[()()]{}",
                "([]",
                "([{]})",
                "abc{defg(ijk)l[mn]op}qr",
                "a(bc)def]"
        };


        System.out.println("========== BALANCED BRACKET TEST ==========");
        for (String expression : expressions) {

            boolean result = BalancedBrackets.isBalanced(expression);

            System.out.printf("Input: %s -> Output: %s\n", expression, result);
        }
    }
}

/*
========== BALANCED BRACKET TEST ==========
Input: [{()}] -> Output: true
Input: [()()]{} -> Output: true
Input: ([] -> Output: false
Input: ([{]}) -> Output: false
Input: abc{defg(ijk)l[mn]op}qr -> Output: true
Input: a(bc)def] -> Output: false
*/