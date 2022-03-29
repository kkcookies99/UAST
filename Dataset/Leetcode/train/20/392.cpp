 class Solution {
public:
    bool XXX(string s) {
        stack<char> sta;
        if((s[0] == ')' || s[0]=='}' || s[0]==']') || s.size()%2 != 0) return 0;
        for(int i=0; i<s.size(); i++){
            if(s[i] == '(' || s[i] == '{' || s[i] == '[')
                sta.push(s[i]);
            else if((s[i]-sta.top() > 0) && (s[i]-sta.top() < 3))
                sta.pop();
            else return 0;
        }
        return sta.empty();
    }
};
