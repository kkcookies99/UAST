 class Solution {
public:
    bool XXX(string s) {
        stack<char> st;
        for(int i=0;i<s.size();++i)
        {
            if(s[i]=='(' || s[i]=='{' || s[i]=='[')
                st.push(s[i]);
            else
            {
                if(st.empty())
                    return 0;
                char& sTop=st.top();
                if(abs(s[i]-sTop)<3)
                    st.pop();
                else
                    return 0;
            }
        }

        if(st.empty())
            return 1;
        else
            return 0;
    }
};

