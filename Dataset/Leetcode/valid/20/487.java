 class Solution {
    public boolean XXX(String s) {
        if (s.length() == 1) return false;

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push('(');
                //continue;
            } 
            else if ( s.charAt(i) == '{'){
                st.push('{');
                //continue;
            }
            else if (s.charAt(i) == '[') {
                st.push('[');
                //continue;
            } 

            else if (!st.isEmpty()) {
                if (s.charAt(i) == ')' && st.peek() == '(') {
                    st.pop();
                } 
                else if (s.charAt(i) == '}' && st.peek() == '{') {
                    st.pop();
                } 
                else if (s.charAt(i) == ']' && st.peek() == '[') {
                    st.pop();
                } else return false; 
            } else {
                return false;
            }
        }

        return st.isEmpty();
    }
}


