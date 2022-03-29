 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        if(nums.empty()) return nums.size();
        for(int i=0;i<nums.size();){
            if(nums[i]==val){
                nums.erase(nums.begin()+i);
            }else{
                i++;
            }
        }
        return nums.size();
    }
};

