 class Solution {
public:
    int XXX(string s) {
        unordered_map<char, int> occ;
        int len = s.size();
        int ret = 0, left = 0, right = 0;
        while(right < len) {
            auto it = occ.find(s[right]);
            if(it != occ.end() && it->second >= left) {
                left = it->second + 1;
            }
            occ[s[right]] = right;
            ++right;
            ret = max(ret, right - left);
        }
        return ret;
    }
};

