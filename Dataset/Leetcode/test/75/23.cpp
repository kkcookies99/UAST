class Solution {
public:
    void XXX(vector<int>& nums) {
        //三路快排思想，大于1的放右边，小于1的放左边，等于1的不动
        int index = -1;
        int l = 0, r = nums.size();
        
        while(l < r){
            if(nums[l] == 0){
                swap(nums[++index], nums[l++]);
            }
            else if(nums[l] == 2){
                swap(nums[--r], nums[l]);
            }
            else
                l++;
        }
        
        return;
    }
};

