 class Solution {
public:
    int XXX(string s) {
        unordered_map<char, int> mp = {
            {'I', 1},
            {'V', 5},
            {'X', 10},
            {'L', 50},
            {'C', 100},
            {'D', 500},
            {'M', 1000}
        };//小的放在大的左边表示减法,仅限一位还好
        int ret = 0;
        int len = s.size();
        char base = s[0];
        for (int i = 1; i < len; i++) {
            if (mp[s[i]] > mp[s[i - 1]]) {
                ret -= mp[s[i - 1]];
            } else {
                ret += mp[s[i - 1]];
            }
        }
        ret += mp[s[len - 1]];
        return ret;

    }
};

