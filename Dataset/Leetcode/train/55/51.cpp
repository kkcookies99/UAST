class Solution {
public:
    bool XXX(vector<int>& nums) {
        int len = nums.size(),max_pos = -1,end = 0;
        for(int i=0;i<len-1;i++){
            max_pos = max(max_pos,nums[i]+i);
            if(i == end){
                if(max_pos == i)
                    return false;
                end = max_pos;
            }
        }
        return true;
    }
};

