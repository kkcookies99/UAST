 class Solution {
public:
    void XXX(vector<int>& nums) {
        int i=0, k=0, l=nums.size()-1;
        while(i<=l){
            if(nums[i]==0) swap(nums[i++], nums[k++]);
            else if(nums[i] == 2) swap(nums[i], nums[l--]);
            else i++;
        }
    }
};

