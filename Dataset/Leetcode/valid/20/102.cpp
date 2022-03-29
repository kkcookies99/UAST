 class Solution {
public:
    bool XXX(string s) {
        if(s.empty()) return true;
        stack<char> st;
        for(auto c:s)
        {
            if(!st.empty() && isMatched(st.top(), c))
                st.pop();
            else 
                st.push(c);
        }
        if(st.empty()) return true;
        return false;
    }
private:
    bool isMatched(const char& c1, const char& c2){
        if(c1 == '(' && c2 == ')') return true;
        if(c1 == '{' && c2 == '}') return true;
        if(c1 == '[' && c2 == ']') return true;
        return false;
    }
};

