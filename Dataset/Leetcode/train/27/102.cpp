 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int cnt = 0;
        for(int i = 0; i < nums.size(); i++){
            if(nums[i] != val){
                nums[cnt] = nums[i];
                cnt++;
            }
        }
        return cnt;
    }
};

