 class Solution {
public:
    bool XXX(string s) {
        stack <char>Stack;
        Stack.push(s[0]);
        for(int i=1;i<s.length();i++)
        {
            if(Stack.empty())
            {
                Stack.push(s[i]);
            }
            else if((Stack.top()=='('&&s[i]==')')||(Stack.top()=='{'&&s[i]=='}')||(Stack.top()=='['&&s[i]==']'))
            {
                Stack.pop();
            }

            else {Stack.push(s[i]);}

        }

        if(Stack.empty())
        {
            return true;
        }
        else{return false;}

    }
};

