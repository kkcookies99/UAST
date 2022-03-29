 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int slow = 0;
        int fast = 0;
        int n = nums.size();
        //快慢指针
        while(fast<n){
            if(nums[fast]!=val){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
};

