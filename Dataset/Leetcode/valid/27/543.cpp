 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int n=nums.size(),slow=0,quick=0;
        while(quick<n){
            while(quick<n&&nums[quick]==val) quick++;
            if(quick<n) nums[slow++]=nums[quick++];
        }
        return slow;
    }
};

