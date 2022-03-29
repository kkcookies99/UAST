class Solution {
public:
    bool XXX(vector<int>& nums) {
        int pmax=0,cur=0;
        //pmax记录能走到最远的位置，cur用来更新pmax
        while(cur<=pmax && pmax<nums.size()-1){
            pmax=max(pmax,cur+nums[cur]);
            cur++;
        }
        return pmax>=nums.size()-1;
    }
};

