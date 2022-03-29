 class Solution {
public:
    bool XXX(string s) {
        stack<char> st;
        for (auto i : s) {
            if (i=='}' && st.size() && st.top()=='{') st.pop();
            else if (i==']' && st.size() && st.top()=='[') st.pop();
            else if (i==')' && st.size() && st.top()=='(') st.pop();
            else st.push(i);
        }
        return st.empty();
    }
};

