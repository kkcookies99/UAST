 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int l=0;
        for(int num : nums){
            if(num!=val){
                nums[l++]=num;
            }
        }
        return l;
    }
};

