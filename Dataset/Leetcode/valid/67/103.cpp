 class Solution {
public:
    string XXX(string a, string b) {
        int i=a.length()-1;int j=b.length()-1;
        int x,y,jin=0;
        string ans;
        for(;i>=0||j>=0;--i,--j)
        {
            if(i<0) x=0;
                else x=a[i]-'0';
            if(j<0) y=0;
                else y=b[j]-'0';
            int z=x+y+jin;
            if(z==0||z==2) ans.append(1,'0');
                else ans.append(1,'1');
            jin=z/2;
        }
        if(jin!=0) ans.append(1,'0'+jin);
        reverse(ans.begin(),ans.end());
        return ans;
    }
};

