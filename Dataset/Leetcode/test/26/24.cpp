 class Solution {
public:
    int XXX(vector<int>& nums) {
        nums.erase(unique(nums.begin(),nums.end()), nums.end());    //unique在algorithm头文件中，功能是去重
        return nums.size();
    }
};

