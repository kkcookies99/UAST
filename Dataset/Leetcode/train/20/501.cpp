 class Solution {
public:
    bool XXX(string s) {
        stack <char>Stack;
        Stack.push(s[0]);
        for(int i=1;i<s.length();i++)
        {
            if(abs(s[i]-Stack.top())==1||abs(s[i]-Stack.top())==2)
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

