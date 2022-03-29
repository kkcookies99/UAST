 class Solution {
public:
    int XXX(vector<int>& prices) {
        int dp0 = 0, dp1 = -prices[0];
        for(int price : prices) {
            dp0 = max(dp0, dp1 + price);
            dp1 = max(dp1, -price);
        }
        return dp0;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


