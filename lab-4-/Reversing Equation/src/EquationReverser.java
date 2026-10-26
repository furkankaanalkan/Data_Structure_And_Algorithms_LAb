/**
 * Your Name:        Furkan Kaan Alkan
 * Your Student ID:  240444034
 * Your Date:        26/10/2026
 */

public class EquationReverser {

    public static String reverseEquation(String equation) { // why the method is static?
        // create the object of the TokenStack class

        TokenStack stack = new TokenStack();


        int i = 0;
        String number = "";

        // TODO 1: Traverse the equation from left to right.
        // Push numbers and operators onto the stack.
        for (char c : equation.toCharArray()) {
            // TODO 2: If the current character is a digit,
            //         Remember the beginning of the number and Move forward until the number ends.
            // Push the whole number as one item.

            if (Character.isDigit(c)) {
                number = number + c;
            }
            else {

                if (!number.isEmpty()) {
                    stack.push(number);
                    number = "";
                }

                // TODO 3: Otherwise, push the operator.
                stack.push(String.valueOf(c));
            }
        }

        if (!number.isEmpty()) {
            stack.push(number);
        }

        // TODO 4: Pop all items from the stack and append
        //         them to a StringBuilder. (Pop items to construct the reversed equation.)
        //String Builder= new StringBuilder() creates an empty builder. Each append() adds a character to it.
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}