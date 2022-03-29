 class Solution {
public:
    bool XXX(string s) {
        stack<char> st;
        for (char c: s) {
            if (c == ')' && !st.empty() && st.top() == '(') {
                st.pop();continue;
            }
            else if (c == ']' && !st.empty() && st.top() == '[') {
                st.pop();continue;
            }
            else if (c == '}' && !st.empty() && st.top() == '{') {
                st.pop();continue;
            }
            st.push(c);
        }
        return st.empty();
    }
};

