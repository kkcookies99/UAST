 class Solution {
public:
    bool XXX(string s) {
        int len=s.length();
        if(len%2==1)
            return false;
        stack<char> st;
        int i=len-1;
        st.push(s[i--]);
        while(i>=0){
            if(st.empty()){
                st.push(s[i--]);
                continue;
            }
            char c=st.top();
            if(c-s[i]==1||c-s[i]==2){//括号配对
                st.pop();
            }
            else
                st.push(s[i]);
            i--;
        }
        return st.empty()?true:false;
    }
};

