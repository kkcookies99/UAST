 class Solution {
public:
    string XXX(int num) {
        char roma1[]={'I','X','C','M'},roma5[]={'V','L','D'};
        string tmp=to_string(num),ans;
        for(int i=0;i<tmp.length();i++) {
            if(tmp[i]=='4'||tmp[i]=='9') {
                ans+=roma1[tmp.length()-i-1];
                tmp[i]=='4'?ans+=roma5[tmp.length()-i-1]:ans+=roma1[tmp.length()-i];
            }
            else    {
                if (tmp[i]-'0'>=5) {
                    ans+=roma5[tmp.length()-i-1];
                    tmp[i]-=5;
                }  
                while(((tmp[i]--)-'0')>0)
                    ans+=roma1[tmp.length()-i-1];
            }
        }
        return ans;
    }
};

