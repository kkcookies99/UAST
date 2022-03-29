 class Solution {
public:
    int XXX(vector<int>& prices) {
        int n = prices.size();
        if(n == 1)
            return 0;
        vector<int> nums(n-1);
        for(int i = 1; i < n; i++)
            nums[i-1] = prices[i] - prices[i-1];
        int pre = 0;
        int Max = nums[0];
        int len = n - 1;
        for(int i = 0; i < len; i++){
            pre = max(0, pre) + nums[i];
            Max = max(Max, pre);
        }
        return max(0, Max);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


