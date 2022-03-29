 class Solution {
public:
    bool XXX(string s) {
        stack<char> p;
        for(auto i:s)
        {
            switch(i)
            {
                case '(':
                    p.push('(');
                    break;
                case ')':
                    if(!p.empty()&&p.top()=='(')
                        p.pop();
                    else
                        return false;
                    break;
                case '{':
                    p.push('{');
                    break;
                case '}':
                    if(!p.empty()&&p.top()=='{')
                        p.pop();
                    else
                        return false;
                    break;
                case '[':
                    p.push('[');
                    break;
                case ']':
                if(!p.empty()&&p.top()=='[')
                        p.pop();
                    else
                        return false;
                    break;
                default:
                    break;
            }
        }
        if(p.empty())
        return true;
        else 
        return false;
    }
};

