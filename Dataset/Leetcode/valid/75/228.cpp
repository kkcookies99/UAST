class Solution {
public:
    void XXX(vector<int>& nums) {
        int pos1 = 0;
        int pos2 = nums.size()-1;
        int i=0;
        while(i<=pos2){
            if(nums[i]==0){
                swap(nums[i],nums[pos1]);
                pos1++;
                i++;
            }
            else if(nums[i]==2){
                swap(nums[i],nums[pos2]);
                pos2--;
            }
            else
                i++;
        }
        return;
    }
};

