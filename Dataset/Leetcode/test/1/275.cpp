 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        unordered_map<int,int> map1;
        for(int i=0;i<nums.size();++i){
            int j=target-nums[i];
            if(map1.find(j)!=map1.end()){
                return vector<int> {map1.find(j)->second,i};
            }else{
                map1[nums[i]]=i;
            }
        }
        return nums;
    }
};

