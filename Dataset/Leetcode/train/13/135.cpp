class Solution {
public:
    int XXX(string s) {
        int res = 0;
        /*罗马字母和数值对应关系*/
        unordered_map<char, int> romans = {{'M', 1000}, {'D', 500}, {'C', 100}, {'L', 50}, {'X', 10}, {'V', 5}, {'I', 1}};

        /*左边字符小于右边字符，说明是特殊情况，先减后加*/
        for (int i = 0; i < s.length(); ++i) i < s.length()-1 && romans[s[i]] < romans[s[i+1]] ? res -= romans[s[i]] : res += romans[s[i]];
        
        return res;
    }
};

