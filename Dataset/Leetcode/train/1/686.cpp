 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        map<int,int> m;
        vector<int> re(2,-1);
        for(int i=0;i<nums.size();i++){
            if(m.count(target-nums[i])>0){
                re[0] = m[target-nums[i]];
                re[1] = i;
                break;
            }
            m[nums[i]] = i;
        }
        return re;
    }
};

