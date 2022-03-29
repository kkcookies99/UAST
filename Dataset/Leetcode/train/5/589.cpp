 class Solution {
public:
    string XXX(string str) {
        string s; s += '#';
        for (auto c : str) { s += c, s += '#';}
        
        vector<int> len(s.size());
        int mx = 0;
        int center = 0;
        for (int i = 0; i < s.size(); i++) {
            int l = 1;
            if (i < mx + len[mx]) {
                l = min(mx + len[mx] - i, len[2 * mx - i]);
            }

            while (0 <= i - l && i + l < s.size() && s[i + l] == s[i - l]) {
                l++;
            }

            len[i] = l;
            if (i + l > mx + len[mx]) {
                mx = i;
            }

            if (len[center] < len[i]) {
                center = i;
            }
        }

        string res;
        for (int i = center - len[center] + 1; i < center + len[center]; i++) {
            if (s[i] != '#') {
                res += s[i];
            }
        }
        return res;
    }
};

