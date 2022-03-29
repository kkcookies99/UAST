 class Solution {
public:
    bool XXX(string s) {
        map<char,char> m;
        m['('] = ')';
        m['['] = ']';
        m['{'] = '}';
            stack<char> kuohaos;
            for(int i=0;i<s.length();i++)
            {
                if(kuohaos.empty()) kuohaos.push(s[i]);
                else{
                    if(m[kuohaos.top()] == s[i]) kuohaos.pop();
                    else kuohaos.push(s[i]);
                }
            }
        return kuohaos.empty()?true:false;
    }
};


