 class Solution {
public:
        if(nums.size() == 0)
            return 0;
    int XXX(vector<int>& nums, int val) {
        for(vector<int>::iterator it = nums.begin();it != nums.end();it++){
            if(*it == val){
                nums.erase(it);
            }
        }
        return nums.size();
    }
};

