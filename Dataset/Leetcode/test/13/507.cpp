 class Solution {
public:
    int XXX(string s) {
        if(s.empty()) return 0;
        vector<string> romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        vector<int> nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int n = s.size();
        int j = 0;
        int result = 0;
        for(int i = 0; i < 13; ++i)
        {
            string roman = romans[i];
            int m = roman.size();
            int num = nums[i];
            while(beginwithstr(s, j, roman))
            {
                result += num;
                j += m;
            }
            if(j >= n) break;
        }
        return result;
    }

private:
    bool beginwithstr(const string& s, int start, const string& target)
    {
        int n = s.size();
        int m = target.size();
        for(int i = 0; i < m; ++i)
            if(start + i >= n || s[start + i] != target[i])
                return false;
        return true;
    }
};

