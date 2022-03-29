 class Solution {
public:
    void XXX(vector<int>& nums) {
        int i=0,j=nums.size()-1;
        for(int k=0;k<=j;){
            switch (nums[k]){
                case 0:
                    swap(nums[i],nums[k]);
                    i++;
                    k++;
                    break;
                case 2:
                    swap(nums[j],nums[k]);
                    j--;
                    break;
                default:
                    k++;
                    break;                                        
            }
        }
    }
};

