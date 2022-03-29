 class Solution {
public:
    string XXX(string s, int numRows) {
        int l=s.length();
        if(l<=numRows||numRows==1)return s;
        int turn=l%(2*numRows-2)==0?l/(2*numRows-2):l/(2*numRows-2)+1,n=0;
        string ans=s;
        for(int i=0;i<numRows;++i){
            for(int j=0;j<turn;++j){
                if(i+j*(2*numRows-2)>=l) break;
                ans[n++]=s[i+j*(2*numRows-2)];
                if(i!=0&&i!=numRows-1){
                    if((j+1)*(2*numRows-2)-i>=l) break;
                    ans[n++]=s[(j+1)*(2*numRows-2)-i];
                }
            } 
        }
        return ans;
    }
};

