 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int n = nums.size();
        if(!n)
            return 0;
        int j = 0;
        int i = n;
        while(j < n){
            if(nums[j] == val){
                for(i = j;j < n;j++){
                    if(nums[j] != val){
                        nums[i] = nums[j];
                        i++;
                    }
                }
            }
            j++;
        }
        return i;
        }
        
};

