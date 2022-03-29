 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        for(vector<int>::iterator iter = nums.begin();iter != nums.end();iter++){
            if(*iter == val){
                nums.erase(iter);
                iter--;
            }
        }
        return nums.size();
    }
};

