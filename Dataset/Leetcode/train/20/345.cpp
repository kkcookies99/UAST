 class Solution {
public:
    bool XXX(string s) {
        stack<char> st;
        for (auto& c: s) {
            if (c == '(') st.emplace(')');
            else if (c == '[') st.emplace(']');
            else if (c == '{') st.emplace('}');
            else {
                if (st.empty() || st.top() != c) return 0;
                //if (st.top() == c) 
                st.pop();
            }
        }
        return st.empty();
    }
};

