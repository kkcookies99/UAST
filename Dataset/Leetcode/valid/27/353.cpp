 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int n = nums.size();
        if(n == 0) return 0;
        int i=0;
        for(int j=0; j<n; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i+1;
    }
};

