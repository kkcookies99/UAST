 class Solution {
public:
    int XXX(vector<int>& nums) {
        if(nums.size() == 0){
            return 0;
        }
        int a = 1;
        for(int i = 1;i < nums.size();i++){
            while(nums[i] == nums[i - 1]){
                i++;
                if(i == nums.size()){
                    return a;
                }
            }
            nums[a] = nums[i];
            a++;
        }
        return a;
    }
};

