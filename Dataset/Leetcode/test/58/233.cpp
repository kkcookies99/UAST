 class Solution {
public:
    int XXX(string s) {
        int ans = 0;
        int i;
        for(i=s.size()-1;i>=0;i--)
        {
            if(s[i] == ' ')
            {
                continue;
            }
            else
                break;
        }//去后置空格

        for(;i>=0;i--)
        {
            if(s[i] == ' ')
            {
                return ans;
            }
            else    ans++;
        }//计数
        return ans;//类"abcdefg     "用例
    }
};

