 class Solution {
public:
    bool XXX(vector<int>& nums) {
        vector<int> jumpLen;
        for(int i = 0;i<nums.size();i++){
            jumpLen.push_back(nums[i]+i);
        }
        int maxlen = jumpLen[0];
        int index = 0;
        while(index<=maxlen){
            if(jumpLen[index]>maxlen){
                maxlen = jumpLen[index];
            }
            if(maxlen>=nums.size()-1){
                return true;
            }
            index++;
        }
    return false;

    }
};

