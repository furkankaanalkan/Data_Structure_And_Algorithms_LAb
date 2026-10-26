public class ReverseEquationDemo {

    public static void main(String[] args) {

        String[] equations = {
                "20-3+5*2",
                "123+45*6",
                "100/25-7"
        };

        //Print the input and output like in the expected output
        for (String equation : equations) {

            String result = EquationReverser.reverseEquation(equation);

            System.out.printf("Input: %s\nOutput: %s \n\n", equation, result);
        }
    }
}

/*
Input:  20-3+5*2
Output: 2*5+3-20

Input:  5+2*56-2/4
Output: 4/2-56*2+5

Input:  123+45*6
Output: 6*45+123

Input:  100/25-7
Output: 7-25/100
*/