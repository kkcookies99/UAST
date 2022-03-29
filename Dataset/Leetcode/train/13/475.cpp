 class Solution {
public:
    int XXX(string s) {
        unordered_map<char, int> rec = {
            {'M', 1000}, {'D', 500}, {'C', 100}, {'L', 50}, {'X', 10}, {'V', 5}, {'I', 1}
        };
        int ans = 0;
        for(int i = 0; i < s.size(); ++i){
            if(rec[s[i]] < rec[s[i+1]])     ans -= rec[s[i]];
            else    ans += rec[s[i]];
        }
        return ans;
    }
};

