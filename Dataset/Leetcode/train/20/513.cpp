 class Solution {
public:
    bool XXX(string s) {
        int n = s.length();
        stack<char> S;
        for(int i=0;i<n;i++)
        {
            if(s[i]=='(') S.push(')');
            else if(s[i]=='[') S.push(']');
            else if(s[i]=='{') S.push('}');
            else if(S.empty()) return false;
            else if(S.top()==s[i])  S.pop();
            else if(S.top()!=s[i]) return false;
        }
        return S.empty();
    }
};

