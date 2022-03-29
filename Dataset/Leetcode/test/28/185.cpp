 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle.empty())
            return 0;
        
        int i, j;
        j = 0;
        for(i = 0; i < haystack.size(); i++)
        {
            if(haystack[i] == needle[j])   //相等needle下标移位
            {
                j++;
            }

            else  //不相等就回溯
            {
                
                i = i - j;
                j = 0;
            }

            if(j == needle.size())   //needle下标到最后了说明匹配完成
            {
                return i - j + 1;
            }
        }

        return -1;
    }
};

