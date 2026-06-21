import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int n : arr) {
            if (stack.isEmpty()) {
                stack.push(n);
                continue;
            }
            if (stack.peek() != n) {
                stack.push(n);
            }
        }
        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i); 
        }
        
        return answer;
    }
}