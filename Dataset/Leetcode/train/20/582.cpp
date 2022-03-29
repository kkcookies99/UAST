 class Solution {
public:
    bool XXX(string s) {
        if (s == "") {
            return false;
        }

        string stack;
        string tmp = s;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s[i] == ']' || s[i] == ')' || s[i] == '}') {
                stack.push_back(s[i]);
                tmp.pop_back();
            }else if(s[i] == '(' || s[i] == '[' || s[i] == '{') {
                if (s[i] == '(' && stack.back() == ')') {
                    stack.pop_back();
                    tmp.pop_back();
                }

                if (s[i] == '[' && stack.back() == ']') {
                    stack.pop_back();
                    tmp.pop_back();
                }

                if (s[i] == '{' && stack.back() == '}') {
                    stack.pop_back();
                    tmp.pop_back();
                }
            }
        }

        if (stack == "" && tmp == "") {
            return true;
        }
        return false;
    }
};

