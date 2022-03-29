class Solution {
public:
    int XXX(vector<int>& nums) {
        int ans = INT_MIN;
        int curSum = 0;
        for(int i = 0; i < nums.size(); i++){
            if(curSum > 0){//延续之前的优势
                curSum += nums[i];
            }else{//抛弃累赘，自立门户
                curSum = nums[i];
            }
            ans = max(ans, curSum);
        }
        return ans;
    }
};

