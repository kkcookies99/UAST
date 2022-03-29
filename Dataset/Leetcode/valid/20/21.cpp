 class Solution {
public:
    bool XXX(string s) {
        stack<char>st;
        for (auto c:s) {
            if (c == '(') {
                st.push(')');
            }else if (c == '[') {
                st.push(']');
            } else if (c == '{') {
                st.push('}');
            } else if ((!st.empty()) && (st.top() == c)) {
                st.pop();
            } else {
                return false;
            }
        }

        return (st.empty()) ? true : false;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

