class Solution {
public:
    string XXX(int n) {
        string dp="1";
        for(int i=1;i<n;i++){
            int cnt=1;
            string temp="";
            for(int j=1;j<dp.size();j++){
                if(dp[j]==dp[j-1])cnt++;
                else{
                    temp+=to_string(cnt)+dp[j-1];
                    cnt=1;
            } 
        }
            temp+=to_string(cnt)+dp[dp.size()-1];
            dp=temp;
        }
        return dp;
    }
};

