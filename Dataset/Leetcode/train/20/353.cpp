 class Solution {
public:
    bool XXX(string s) {
        
        if(!s.length())return true;
        
        stack<char> st;
        for(int i=0;i<s.length();i++)
        {
            if((s[i]==']' || s[i]==')' || s[i]=='}') && !st.empty())
            {
                char ch=st.top();
                st.pop();
                if(ch!=s[i]-1 &&ch!=s[i]-2)return false;
                
            }
            else st.push(s[i]);
            
        }
        
        if(!st.empty())return false;
        
        return true;
    }
};

