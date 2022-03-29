 class Solution {
    public boolean XXX(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == '('){
                st.push(')');
            }
            else if(s.charAt(i) == '{'){
                st.push('}');
            }
            else if(s.charAt(i) == '['){
                st.push(']');
            }

            else if(st.empty() || st.pop() != s.charAt(i)){
                return false;
            }

        }

        return st.empty();

    }
}

