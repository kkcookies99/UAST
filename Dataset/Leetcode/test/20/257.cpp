 class Solution {
public:
    bool XXX(string s) {
        if (s.length() % 2) return false;
        stack<char> st;
        for (size_t i = 0; i < s.length(); ++i)
        {
            if (s[i] == '(' || s[i] == '[' || s[i] == '{')
            {
                st.push(s[i]);
            }
            else
            {
                if (st.empty()) return false;
                if (st.top() == '(' && s[i] == ')' 
                    || st.top() == '[' && s[i] == ']'
                    || st.top() == '{' && s[i] == '}')
                    st.pop();
                else
                    return false;
            }
        }
        return st.empty();
    }
};

