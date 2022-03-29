 class Solution {
public:
    string XXX(string s) {
        bool dp[1001][1001]={0};
        int length=0;
        int res[2]={0};
        for(int i=s.size();i>=0;i--)
            for(int j=i;j<s.size();j++){
                if(s[i]==s[j]){
                    if(j-i<2){
                        dp[i][j]=true;
                        if(j-i+1>length){
                            length=j-i+1;
                            res[0]=i;
                            res[1]=j;
                        } 
                    }
                    else{
                        dp[i][j]=dp[i+1][j-1];
                        if(dp[i][j]&&j-i+1>length){
                            length=j-i+1;
                            res[0]=i;
                            res[1]=j;
                        } 
                    }     
                }
            }
        return s.substr(res[0],res[1]-res[0]+1);
    }
};

