 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows==1)  return s;
        vector<string> tmp(numRows);
        int i=0;
        int n=s.size();
        while(i<n){
            // 放竖行
            for(int j=i;j<i+numRows&&j<n;j++)
                tmp[j-i]+=s[j];
            i+=numRows;
            // 放斜行
            for(int k=i;k<i+numRows-2&&k<n;k++ )
                tmp[numRows-2-(k-i)]+=s[k];
            i+=numRows-2;
        }
        string ans;
        for(int i=0;i<numRows;i++)
            ans+=tmp[i];
        return ans;
    }
};

