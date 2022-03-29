class Solution {
public:
    string describe(string str){
        string ret = "";
        int i = 0;
        while(i<str.size()){
            int count = 1;
            int j = i;
            while(j < str.size()){
                if(j+1<str.size() && str[j] == str[j+1]){
                    count++;
                    j++;
                }
                else{
                    j++;
                    break;
                }
            }
            ret += to_string(count);
            ret += str[i];
            i = j;
        }
        return ret;
    }
    string XXX(int n) {
        vector<string> dp(32);
        dp[1] = "1";
        dp[2] = "11";
        string str;
        for(int i=3;i<=n;i++){
            str = dp[i-1];
            dp[i] = describe(str);
        }
        return dp[n];
    }
};

