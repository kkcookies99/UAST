 class Solution {
public:
    bool XXX(string s) {
        vector<char> vec;
        char temp;
        for(int i=0;i<s.length();i++)
        {
            if(s[i]=='('||s[i]=='['||s[i]=='{')
            {
                vec.push_back(s[i]);
            }
            else
            {
                temp=vec.back();
                if(s[i] == ')' && temp != '(')
                    return false;
                if(s[i] == ']' && temp != '[')
                    return false;
                if(s[i] == '}' && temp != '{')
                    return false;
                vec.pop_back();
            }
        }
        if(vec.size()==0)
           return true;
        else 
           return false;
    }
};

