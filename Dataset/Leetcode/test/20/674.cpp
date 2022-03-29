 class Solution {
public:
    bool XXX(string s) {
        stack<char> tmp;
        tmp.push('#');
        for(auto& i:s)
        {
            switch(i)
            {
            default:tmp.push(i);break;
            case ')':
                if(tmp.top()=='(') tmp.pop();
                else return false;
                break;
            case ']':
                if(tmp.top()=='[') tmp.pop();
                else return false;
                break;
            case '}':
                if(tmp.top()=='{') tmp.pop();
                else return false;
                break;
            }
        }
        return tmp.size()==1;
    }
};

