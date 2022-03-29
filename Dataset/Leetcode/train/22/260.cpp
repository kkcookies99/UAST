 class Solution {
public:
    void init(vector<string> &vi, int n, int sum, string s) //把所有情况加入
    {
        if (2 * n == sum) {
            vi.push_back(s);
            return ;
        }
        s.push_back('(');
        init(vi, n, sum + 1, s);
        s.pop_back();

        s.push_back(')');
        init(vi, n, sum + 1, s);
    }
    bool isvalid(const string& s) 
    {
        stack<char> st;
        for (int i = 0; i < s.size(); ++i) {
            if (s[i] == ')') {
                if (st.empty() || st.top() != '(') return false;
                else st.pop();
            } else {
                st.push('(');
            }
        }  
        if (st.empty()) return true;
        return false;
    }
    vector<string> XXX(int n) {
        vector<string> vi, ret;
        init(vi, n, 0, "");
        for (int i = 0; i < vi.size(); ++i) {
            if (isvalid(vi[i])) ret.push_back(vi[i]); 
        }
        return ret;
    }
};

