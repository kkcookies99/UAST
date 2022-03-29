 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        auto iter = nums.end();
        if(nums.size() == 0){
            return 0;
        }
        iter--;
        while(iter - nums.begin() >= 0){
            auto  t = iter;
            if(*iter == val){
                nums.erase(iter);
            } 
            iter = t;
            if(iter == nums.begin()){
                break;
            }
            iter--;
        }
        return nums.size();

    }
};```

