 class Solution {
public:
    bool XXX(string s) 
    {
        stack<char> stack;
        int n=s.size();
        for(int i=0;i<n;i++)
        {
            if(s[i]=='('||s[i]=='{'||s[i]=='[')
            {
                stack.push(s[i]);
            }
            else if(s[i]==')'||s[i]=='}'||s[i]==']')
            {
               switch(s[i])
               {
                   case ')':
                       {
                            if(stack.size()==0)
                               return false;
                            if(stack.top()=='(')
                            {
                                stack.pop();
                            }
                            else
                            {
                                return false;
                            }
                       }break;
                       case '}':
                       {
                            if(stack.size()==0)
                               return false;
                            if(stack.top()=='{')
                            {
                                stack.pop();
                            }
                            else
                            {
                                return false;
                            }
                       }break;
                       case ']':
                       {
                           if(stack.size()==0)
                               return false;
                            if(stack.top()=='[')
                            {
                                stack.pop();
                            }
                            else
                            {
                                return false;
                            }
                       } break;
                   
               }
            }
        }
        if(stack.size()==0)
            return true;
        else
            return false;
    }
};

