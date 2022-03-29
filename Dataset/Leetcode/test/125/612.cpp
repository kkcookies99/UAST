 class Solution {
public:
    bool XXX(string s) 
    {
        int left = 0, right = s.size()-1;
        while(left < right)
        {
            //左右必须是字母或数字
            while(left<right && !isalnum(s[left]))
                ++left;
            while(left<right && !isalnum(s[right]))
                --right;
            //统一换成大写字母进行比较，数字不受影响
            if(toupper(s[left])!=toupper(s[right]))
                return false;
            ++left;
            --right;
        }
        return true;
    }
};

