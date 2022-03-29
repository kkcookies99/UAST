 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        //双指针
        int quick = 0, slow = 0;

        while(quick < nums.size()){
            if(nums[quick] == val){
                quick++;
            }else{
                swap(nums[quick], nums[slow]);
                quick++;
                slow++;
            }
        }
        // cout << "quick:" << quick << endl;
        // cout << "slow:" << slow << endl;
        return nums.size() - (quick - slow);
    }
};

