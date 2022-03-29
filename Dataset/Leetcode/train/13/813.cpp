 class Solution {
public:
    int XXX(string s) {
        unordered_map<string, int> m = {
            {"M", 1000},
            {"D", 500},
            {"C", 100},
            {"L", 50},
            {"X", 10},
            {"V", 5},
            {"I", 1}
        };
        int ans = 0;
        for (int i = 0; i < s.size(); i ++) {
            if (i < s.size() - 1 && m[{s[i]}] < m[{s[i + 1]}])  ans -= m[{s[i]}];
            else  ans += m[{s[i]}];
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


