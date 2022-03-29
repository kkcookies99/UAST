class Solution {
public:
    int XXX(string s) {
        int sum[50]={0},num=0;
        for(int i=0;i<s.length();i++)
        {
            switch(s[i])
            {
                case 'I':sum[i]=1;break;
                case 'V':sum[i]=5;break;
                case 'X':sum[i]=10;break;
                case 'L':sum[i]=50;break;
                case 'C':sum[i]=100;break;
                case 'D':sum[i]=500;break;
                case 'M':sum[i]=1000;break;
            }
            if(i>0&&sum[i]>sum[i-1]) sum[i-1]=-sum[i-1];
        }
        for(int i=0;i<s.length();i++) num=num+sum[i];
        return num;
    }
};

