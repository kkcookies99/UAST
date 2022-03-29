 class Solution {
public:
    int XXX(string s) {
        int res = 0;//最长子串返回值
        int m[256] = {0};//类似于hash桶
        int left = 0;//左边界
        for(int i = 0; i < s.size(); i++)
        {
            if(m[s[i]] == 0 || m[s[i]] < left )//如果当前查看字符没有在当前子串中出现
            {
                res = max(res , i-left+1);//更新res的值
            }
            else
            {
                left = m[s[i]];//如果出现了，就更新左边界的值
            }
            m[s[i]] = i+1;//更新当前字符的出现位置
        }
        return res;
    }
};

