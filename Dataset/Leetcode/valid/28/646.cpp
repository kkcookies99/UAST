 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle=="")return 0;
        int cnt = 0;//cnt为计数
        int j = 0;//j为haystack的索引
        int i = 0;//i为needle的索引
        while(j<haystack.size()&&i<needle.size())
        {
            if(haystack[j]!=needle[i])//如果是不相等，i置为0重新开始，j置为下一个位置
            {
                cnt++;
                j=cnt;
                i =0;
            }
            else//如果相等的话都向后移一位
            {
                j++;
                i++;
            }
        }
        return i==needle.size()?cnt:-1;
       
    }
};

