 class Solution {
public:
    string count(string s) {
        string res = "";
        int nums = 0;
        char pre = s[0];
        for (int i = 0; i < s.size(); i++) {
            if (s[i] != pre) {
                res += to_string(nums);
                res += pre;
                nums = 1;
                pre = s[i];
            }
            if (i == (s.size() - 1)) {
                res += to_string(nums);
                res += s[i];
            }
            nums++;
        }
        return res;

    }
    string XXX(int n) {
        if (n == 1) return "1";
        string ans = "1";
        while(n >= 1) {
            ans = count(ans);
            n--;
        } 
        return ans;
    }
};

