 class Solution {
public:
    int XXX(string haystack, string needle) {
        int len1=haystack.size(),len2=needle.size();
        if(len1<len2){return -1;}
        if(len2 == 0){return 0;}    //若needle是空格，返回0.
        for(int i=0;i<(len1-len2+1);i++)    //这里注意+1
        {
            int j=0,k=i;    //用i保存下标，用k代替i的位置，不断右移将haystack和needle进行比较。
            while(j<len2 && haystack[k] ==  needle[j])
            {
                k++;
                j++;
            }
            if(j>=len2){return i;}
        }
        return -1;
    }
};

