 class Solution {
public:
    int XXX(string s) {
        int ret = 0;
        unordered_set<char> st;
        int l = 0, r = 0;
        int n = s.size();
        while (r < n) {
            while (l < r && st.find(s[r]) != st.end()) {
                st.erase(s[l++]);
            }
            st.emplace(s[r++]);
            ret = max(ret, (int)st.size());
        }
        return ret;
    }
};

