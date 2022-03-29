 class Solution {
public:
    int XXX(string s) {
        int n = s.size();
        unordered_map<char, int> index;
        int len = 0, maxLen = 0;

        for (int i = 0; i < n; ++i) {
            auto r = index.find(s[i]);

            if (r == index.end()) {
                index.insert({s[i], i});
                ++len;
                if (len > maxLen) maxLen = len;
            } else {
                len = 0;
                int mark = i;
                i = r->second;

                for (int j = i + 1; j <= mark; ++j)
                    index.erase(s[j]);
            }
        }

        return maxLen;
    }
};

