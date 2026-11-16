/**
 * BracketStack.java
 * Your Name:        Furkan Kaan Alkan
 * Your Student ID:  240444034
 * Your Date:        26/10/2026
 */

public class BalancedBrackets {

    public static boolean isBalanced(String s) {

        // Create a stack
        BracketStack stack = new BracketStack();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char c1 = stack.pop();
                if ((c == '}' && c1 != '{') || (c == ']' && c1 != '[') || (c == ')' && c1 != '(')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
        // TODO:
        // 1. Traverse the string character by character.
        // 2. If the character is an opening bracket,
        //    push it onto the stack.
        // 3. If it is a closing bracket:
        //      - Check whether the stack is empty.
        //      - Pop the top opening bracket.
        //      - Check whether the brackets match.(call isMatchingPair method)
        // 4. At the end, check whether the stack is empty.
    }

    private static boolean isMatchingPair(char opening, char closing) {

        // Check: ( matches )
        if (opening == '(' && closing == ')') {
            return true;
        }
        // Check: [ matches ]
        else if (opening == '['  && closing == ']') {
            return true;
        }
        // Check: { matches }
        else if (opening == '{' && closing == '}') {
            return true;
        }
        // if check does not match; then return false
        else {
            return false;
        }
    }
}
