 class Solution {
public:
    bool XXX(string s) {
        char stack[10000];
        int p=0;
        for(int i=0;i<s.size();i++)
        {
            if(s[i]=='('||s[i]=='['||s[i]=='{')
            {
                stack[p++]=s[i];
            }
            else if(s[i]==')')
            {
                if(p==0) return false;
                if(stack[p-1]=='(')
                {
                    p--;
                }
                else
                    return false;
            }
            else if(s[i]==']')
            {
                if(p==0) return false;
                if(stack[p-1]=='[')
                {
                    p--;
                }
                else
                    return false;
            }
            else if(s[i]=='}')
            {
                if(p==0) return false;
                if(stack[p-1]=='{')
                {
                    p--;
                }
                else
                    return false;
            }

        }
        if(p==0)
            return true;
        return false;
    }
};

