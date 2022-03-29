class Solution {
public:
    int XXX(string s) {
        vector<int> nums{900, 1000, 400, 500, 90, 100, 40, 50, 9, 10, 4, 5, 1};
        vector<string> rome{"CM", "M", "CD", "D", "XC", "C", "XL", "L", "IX", "X", "IV", "V", "I"};
        int res = 0;
        for(int i = 0; i < 13; i++)
        {
            while(s.find(rome[i]) != s.npos)
            {
                s.replace(s.find(rome[i]), rome[i].size(), " ");
                res += nums[i];
            }
        }

        return res;
    }
};

