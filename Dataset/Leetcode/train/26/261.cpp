 class Solution {
public:
    int XXX(vector<int>& nums) {
        if(nums.size()==0) return 0;
        if(nums.size()==1) return nums.size();
        int j=0;
        for(int i=1;i<nums.size();i++){
            if(nums[j]!=nums[i]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
        }
};

