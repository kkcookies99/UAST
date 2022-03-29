 class Solution {
public:
    string XXX(string s) {
        string str;
        str.push_back('$');
        for(auto i:s){
            str+='#';
            str+=i;
        }
        str.push_back('#');
        str.push_back('@');
        int res=0;
        int left;
        vector<int>dp(str.size(),0);
        int right=0;
        int pos=0;
        for(int i=1;i<str.size()-1;i++){
            if(i<right)
                dp[i]=min(dp[2*pos-i],right-i+1);
            else
                dp[right=i]=1;
            while(str[i-dp[i]]==str[i+dp[i]])
                dp[i]++;
            if(i+dp[i]-1>right){
                right=dp[i]+i-1;
                pos=i;
            }
            if(dp[i]-1>res){
                res=dp[i]-1;
                left=(i-dp[i])/2;
            }
        }
        return s.substr(left,res);
    }
};

