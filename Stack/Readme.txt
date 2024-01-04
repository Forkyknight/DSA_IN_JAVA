
Java follows camel-case syntax for naming the class, interface, method, and variable.

Class name should start with Uppercase and it should be noun

Interface should start with Uppercase and it should be an adjective

Method and variable should start with lowercase, If the name contains multiple words, start it with a lowercase letter followed by an uppercase letter such as actionPerformed().

Package	It should be a lowercase letter such as java, lang.
If the name contains multiple words, it should be separated by dots (.) such as java.util, java.lang.

Constant	It should be in uppercase letters such as RED, YELLOW.
If the name contains multiple words, it should be separated by an underscore(_) such as MAX_PRIORITY.
It may contain digits but not as the first letter.
-------------------
mention package on top of java file

Basic Template

package Stack;

import java.io.*;

public class <className> {

    public static void main(String[] args) throws IOException {
        String inputFileName = "/home/forkyknight/Desktop/DSA_Prac_JAVA/input.txt";
        String outputFileName = "/home/forkyknight/Desktop/DSA_Prac_JAVA/output.txt";
        BufferedReader read = new BufferedReader(new FileReader(inputFileName));
        int testCase = Integer.parseInt(read.readLine());
        System.out.println(testCase);
        while (testCase > 0) {
            solve(read);
            testCase--;
        }

        read.close();
    }

    public static void solve(BufferedReader read) throws IOException {
        String bracketPattern = read.readLine().trim();
        System.out.println(bracketPattern);
    }
}


Important Stack methods
Stack is subclass of Vector.
Remember, Stack is a subclass of Vector, which means it inherits all the methods from Vector and provides additional stack-specific operations on top of that. However, it's often recommended to use Deque implementations (like ArrayDeque or LinkedList) from the Java Collections Framework instead of Stack due to certain performance and design considerations.


push(E item):
Adds an element to the top of the stack.

pop():
Removes and returns the element at the top of the stack.

peek():
Returns the element at the top of the stack without removing it.

empty():
Checks if the stack is empty.

search(Object o):
Searches for an element in the stack and returns its position (distance from the top). Returns -1 if the element is not found.


