class Solution {
public:
    void XXX(vector<int>& nums) {
        int flag[3]={0,1,2};
        int ptr=0;
        for(auto color:flag){
            for(int i=0;i<nums.size();i++){
                if(nums[i]==color)
                    swap(nums[i],nums[ptr++]);
            }
    }
    }
};

