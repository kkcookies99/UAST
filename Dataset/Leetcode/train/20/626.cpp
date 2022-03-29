 class Solution {
public:
    bool XXX(string s) {
        int len = s.size();
        if (len % 2 != 0) { return false; }
        stack<char> st;
        for (int i = 0; i < len; i++) {
            if (s[i] == '(') { st.push(')'); }
            else if (s[i] == '[') { st.push(']'); }
            else if (s[i] == '{') { st.push('}'); }
            else if (!st.empty() && st.top() == s[i]) { st.pop(); }
            else { return false; }
        }
        return st.empty();
    }
};

