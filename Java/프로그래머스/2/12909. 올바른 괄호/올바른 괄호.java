import java.util.Stack;
import java.util.EmptyStackException;

class Solution {
    boolean solution(String s) {
        Stack<String> stack = new Stack<>();
        String[] input = s.split("");
        
        try {
            for (String k : input) {
                if (k.equals("(")) stack.push(k);
                else stack.pop();
            }
        } catch (EmptyStackException e) {
            return false;
        }
        
        if (!stack.isEmpty()) return false;

        return true;
    }
}