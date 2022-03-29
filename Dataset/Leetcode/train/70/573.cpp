class Solution {
public:
    int XXX(int n) {
        vector<int> dp(2, 0);
        if(n <= 2){
            return n;
        }
        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2; i < n; i++){
            int tmp = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = tmp;
        }
        return dp[1];
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


