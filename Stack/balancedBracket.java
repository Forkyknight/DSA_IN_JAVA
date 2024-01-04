package Stack;

import java.util.*;
import java.io.*;

public class balancedBracket {

    public static void main(String[] args) throws IOException {
        String inputFileName = "/home/forkyknight/Desktop/DSA_Prac_JAVA/input.txt";
        String outputFileName = "/home/forkyknight/Desktop/DSA_Prac_JAVA/output.txt";
        BufferedReader read = new BufferedReader(new FileReader(inputFileName));
        int testCase = Integer.parseInt(read.readLine());
        System.out.println(testCase);
        while (testCase > 0) {
            if (solve(read)) {
                System.out.println("balanced");
            } else {
                System.out.println("Unbalanced");
            }
            testCase--;
        }

        read.close();
    }

    public static boolean solve(BufferedReader read) throws IOException {
        String bracketPattern = read.readLine().trim();
        System.out.println(bracketPattern);
        Stack<Character> bracketStack = new Stack<>();// why we have not specified the stack type.
        Map<Character, Character> brMap = new HashMap<>();
        brMap.put(']', '[');
        brMap.put('}', '{');
        brMap.put(')', '(');

        for (int i = 0; i < bracketPattern.length(); i++) {
            Character bracket = bracketPattern.charAt(i);
            if (bracket == '[' || bracket == '{' || bracket == '(') {
                bracketStack.push(bracket);
            } else {
                if (!bracketStack.empty() && bracketStack.peek() == brMap.get(bracket)) {
                    bracketStack.pop();
                } else {
                    return false;
                }
            }
        }

        return bracketStack.empty();
    }
}