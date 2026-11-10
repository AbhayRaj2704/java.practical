import java.util.*;
class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(i);
            }
            else if (ch == ')') {
                if (st.isEmpty()) {
                    sb.deleteCharAt(i);
                    i--;
                }
                else {
                    st.pop();
                }
            }
            i++;
        }

        while (!st.isEmpty()) {
            sb.deleteCharAt(st.pop());
        }

        return sb.toString();
    }
}