 class Solution {
public:
    int expand(string& s, int l, int r) {
        while (l >= 0 && r < s.size() && s[l] == s[r]) {
            l--;
            r++;
        }
        return (r - l - 2) / 2;
    }

    string XXX(string s) {
        string str = "#";
        for (char c : s) {
            str += c;
            str += '#';
        }
        int begin = 0, end = 1;
        int center = -1, right = -1, str_len = str.size();
        vector<int> arm_len(str_len, 0);
        for (int i = 0; i < str_len; ++i) {
            if (i < right) {
                arm_len[i] = min(right-i, arm_len[2*center-i]);
                arm_len[i] = expand(str, i-arm_len[i], i+arm_len[i]);
            } else {
                arm_len[i] = expand(str, i, i);
            }
            if (i + arm_len[i] > right) {
                right = i + arm_len[i];
                center = i;
            }
            if (arm_len[i] > end - begin) {
                begin = (i - arm_len[i]) / 2;
                end = (i + arm_len[i]) / 2;
            }
        }
        
        return s.substr(begin, end-begin);
    }
};

