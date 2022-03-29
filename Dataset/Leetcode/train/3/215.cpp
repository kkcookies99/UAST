 class Solution {
public:
    int XXX(string s) {
        int maxLength = 0;
        map<char, int> m;
        int len = 0;
        for (int i = 0; i < s.size(); i ++) {
            if (m.count(s[i]) == 0) {
                len += 1;
                m[s[i]] = i;
            } else {
                len = 0;
                i = m[s[i]];
                m.clear();
            }
            if (maxLength < len) {
                    maxLength = len;
                }
        }
        return maxLength;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

