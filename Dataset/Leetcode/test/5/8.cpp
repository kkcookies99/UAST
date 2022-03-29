 class Solution {
public:
    int left = 0;
    int right = 0;
    int maxLength = 0;
    string XXX(string s) {
        int result = 0;
        for (int i = 0; i < s.size(); i++) {
            extend(s, i, i, s.size()); // 以i为中心
            extend(s, i, i + 1, s.size()); // 以i和i+1为中心
        }
        return s.substr(left, maxLength);
    }
    void extend(const string& s, int i, int j, int n) {
        while (i >= 0 && j < n && s[i] == s[j]) {
            if (j - i + 1 > maxLength) {
                left = i;
                right = j;
                maxLength = j - i + 1;
            }
            i--;
            j++;
        }
    }
};


