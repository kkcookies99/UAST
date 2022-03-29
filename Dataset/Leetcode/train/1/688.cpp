 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        while (true){
            int index1 = rand()%nums.size();
            int index2 = rand()%nums.size();
            while (index1 == index2) index2 = rand()%nums.size();
            
            if(nums[index1] + nums[index2] == target){
                return  {index1 , index2};
            }
        }return {};
    }
};

