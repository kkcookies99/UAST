 class Solution {
public:
    int XXX(string haystack, string needle) {
        if(needle=="")return 0;
        if(haystack=="")return -1;
        int m=needle.size(),n=haystack.size();
        vector<int> next(m);//KMP的精髓之处，就在于这个数组，next[i]表示的是模式串0~i的最长相同前后缀的长度
        get_next(next,needle);//获得needle的next数组
        int j=0;//为在needle这个模式串的位置
        for(int i=0;i<n;++i)
        {
            while(j>0&&haystack[i]!=needle[j])
            {
                j=next[j-1];
            }
            if(haystack[i]==needle[j])
                ++j;
            if(j==m)//遍历结束
                return i-m+1;
        }
        return -1;
    }
    void get_next(vector<int>& next,string needle)
    {
        next[0]=0;
        int len=needle.size();
        int k=0;
        for(int i=1;i<len;++i)
        {
            while(k!=0&&needle[k]!=needle[i])
            {
                k=next[k-1];
            }
            if(needle[k]==needle[i])//最后终于匹配上了
            {
                ++k;
            }
            next[i]=k;
        }
    }
};

