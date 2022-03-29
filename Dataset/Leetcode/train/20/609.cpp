 class Solution {
public:
    bool XXX(string s) {
        stack<char> stack1;
        for(int i=0;i<s.size();++i)
        {
            if(s[i]=='}'||s[i]==')'||s[i]==']')
            {
                if(stack1.size()==0 || (stack1.top()+1!=s[i] && stack1.top()+2!=s[i]))
                    return false;
                stack1.pop();
            }
            else
            {
                stack1.push(s[i]);
            }
        }
        return stack1.empty();
    }
};

