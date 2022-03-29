 class Solution {
public:
    bool XXX(string s) {
        stack<char> st;
        bool flag = false;
        for(int i = 0; i < s.size(); i++){
            if(st.empty()){
                st.push(s[i]);
            }
            else{
                if(st.top()=='['&&s[i]==']')
                {
                    st.pop();
                    flag = true;
                }
                else if(st.top() == '(' && s[i] == ')')
                {
                    st.pop();
                    flag = true;
                }
                else if (st.top() == '{' && s[i] == '}'){
                    st.pop();
                    flag = true;
                }
                if (flag == false)
                    st.push(s[i]);
                flag = false;
            }
        }
        if(st.empty())
            flag = true;
        else
            flag = false;
        return flag;
    }
};

