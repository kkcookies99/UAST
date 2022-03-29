 class Solution {
public:
    bool XXX(string s) {
        stack<char> st;
        for( char c:s ){
            if( c=='('||c=='['||c=='{' ){
                st.push(c);
            }else{
                if(st.empty())return false;
                char t=st.top();
                st.pop();
                if(c==')'){
                    if(t!='(')return false;
                }else if(c=='}'){
                    if(t!='{')return false;
                }else{
                    if(t!='[')return false;
                }
            }
        }
        if(!st.empty())return false;
        return true;
    }
};

