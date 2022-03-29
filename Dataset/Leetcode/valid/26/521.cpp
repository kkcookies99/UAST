 class Solution {
public:
    int XXX(vector<int>& nums) {
        int n = nums.size();
        int newSize = 1;
        if(n<2) return n;
        int j = 0;
        for(int i = 1;i<n;i++){
            if(nums[i]!=nums[j]){
                nums[++j] = nums[i];
                newSize++;
            }
        }
        return newSize;

    }
};

