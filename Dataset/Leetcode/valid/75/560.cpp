 class Solution {
public:
    void XXX(vector<int>& nums) {
        if(nums.size()<=1) return;
        int i=0,j=nums.size()-1;
        for(int k=0;k<=j;){
            if(nums[k]==0)
                swap(nums[k++],nums[i++]);          
            else if(nums[k]==2)
                swap(nums[k],nums[j--]);            
            else if(nums[k]==1)
                k++;            
        }
    }
};

