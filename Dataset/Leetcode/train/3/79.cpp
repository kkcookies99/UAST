 class Solution {
public:
    int XXX(string s) {
        int len = s.length();
        if(len == 0 || len == 1) return len;
        int left = 0, right = 1, max = 1;
        while(right<len)
        {
            while(right<len && s.find(s[right],left)==right)
            {
                right++;
            }
            max = right - left > max ? right - left : max;
            left = s.find(s[right],left) + 1;
        }
        return max;
    }
};

