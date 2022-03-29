 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int p1 =0,p2 =0;
        int n  = nums.size();
        while(0<n--){
            if(nums[p2]!= val){
                nums[p1++] = nums[p2];
            }
            p2++;
        }
        return p1;
    }
};

