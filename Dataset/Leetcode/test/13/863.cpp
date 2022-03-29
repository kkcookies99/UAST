 class Solution {
public:
    int XXX(string s) {
        unordered_map<char, int> d {
            {'I', 1}, {'V', 5}, {'X', 10}, 
            {'L', 50}, {'C', 100}, {'D', 500},
            {'M', 1000}
        };

        int len = s.size(), r = 0;
        for (int i = 0; i < len; i++) {
            if (i + 1 < len && d[s[i]] < d[s[i + 1]]) r -= d[s[i]];
            else r += d[s[i]];
        }

        return r;
    }
};

