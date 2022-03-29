 class Solution {
public:
    string XXX(string s, int numRows) {
        int times=s.size()/numRows;
        int sur=s.size()%numRows;
        if(times==0||(times==1&&sur==0))return s;
        if(numRows==1)return s;
        string ans="";
        int fl=0;
        while(fl<=s.size()-1)
        {
            ans+=s[fl];
            fl+=numRows*2-2;
        }
        for(int i=1;i<numRows-1;i++)
        {
            int j=i, k=numRows*2-2-i;
            while(j<s.size()||k<s.size())
            {
                if(j<s.size())ans+=s[j];
                if(k<s.size())ans+=s[k];
                j+=numRows*2-2;
                k+=numRows*2-2;
            }
        }
        int ll=numRows-1;
        while(ll<=s.size()-1)
        {
            ans+=s[ll];
            ll+=numRows*2-2;
        }
        return ans;
    }
};

