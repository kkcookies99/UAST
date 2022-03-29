 class Solution {
public:
    int XXX(string s) {
        int res=0;
        int l=0;//左
        int r=0;//右
        int a[128]={0};
        for(int i=0;i<s.size();i++)
        {
            if(a[s[i]]==0)
            {
                a[s[i]]=1;
                r++;
            }
            else
            {
                res=max(res,r-l);
                while(a[s[i]]!=0)
                {
                    a[s[l++]]=0;
                }
                a[s[i]]=1;
                r++;
            }
        }//end for
        res=max(res,r-l);
        return res;
    }
};

